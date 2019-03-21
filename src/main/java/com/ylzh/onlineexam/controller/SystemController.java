package com.ylzh.onlineexam.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ylzh.onlineexam.util.PasswordHelper;
import com.ylzh.onlineexam.util.UUIDUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.subject.Subject;
import org.crazycake.shiro.RedisCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylzh.onlineexam.entity.Permission;
import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.service.PermissionService;
import com.ylzh.onlineexam.service.SysConfigService;
import com.ylzh.onlineexam.service.UserService;
import com.ylzh.onlineexam.util.CoreConst;
import com.ylzh.onlineexam.util.ResultUtil;
import com.ylzh.onlineexam.vo.base.ResponseVO;
import com.google.code.kaptcha.Constants;


@Controller
public class SystemController{
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private RedisCacheManager redisCacheManager;
    @Autowired
    private SysConfigService configService;

    /*重定向到login*/
    @RequestMapping("/")
    public String redirectLogin() {
        return "redirect:/login";
    }

    /*后台首页*/
    @RequestMapping(value={"/index"})
    public String index(){
        return "index/index";
    }

    /*登陆*/
    @GetMapping("/login")
    public String login(Model model){
        if(SecurityUtils.getSubject().isAuthenticated()){
            return "redirect:/index";
        }
        getSysConfig(model);
        return "system/login";
    }

    /*注册*/
    @GetMapping("/register")
    public  String register(Model model) {
        if(SecurityUtils.getSubject().isAuthenticated()){
            return "redirect:/index";
        }
        getSysConfig(model);
        return "system/register";
    }
    /*提交登录*/
    @PostMapping("/register")
    @ResponseBody
    public ResponseVO register(HttpServletRequest request, String userName, String password,String confirmPassword, String verification, String phoneCode, String email){
        //判断验证码
        String rightCode = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isNotBlank(verification) && StringUtils.isNotBlank(rightCode) && verification.equals(rightCode)) {
            //验证码通过
        } else {
            return ResultUtil.error("验证码错误！");
        }
        //判断两次输入密码是否相等
        if (confirmPassword != null && password != null) {
            if (!confirmPassword.equals(password)) {
                return ResultUtil.error("两次密码不一致");
            }
        }
        User userForm = new User();
        userForm.setUsername(userName);
        userForm.setNickname(userName);
        userForm.setUserId(UUIDUtil.getUniqueIdByUUId());
        userForm.setStatus(CoreConst.STATUS_VALID);
        userForm.setEmail(email);
        userForm.setPhone(phoneCode);
        userForm.setSalt("ylzh");
        userForm.setSalt(userForm.getCredentialsSalt());
        Date date = new Date();
        userForm.setCreateTime(date);
        userForm.setUpdateTime(date);
        userForm.setLastLoginTime(date);
        userForm.setPassword(confirmPassword);
        PasswordHelper.encryptPassword(userForm);
        System.out.println("register user info :" + userForm.toString());
        int num = userService.register(userForm);
        if(num > 0){
            return ResultUtil.success("添加用户成功");
        }else {
            return ResultUtil.error("添加用户失败");
        }
    }

    /*提交登录*/
    @PostMapping("/login")
    @ResponseBody
    public ResponseVO login(HttpServletRequest request, String username, String password, String verification,
                            @RequestParam(value = "rememberMe", defaultValue = "0") Integer rememberMe){
        //判断验证码
        String rightCode = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isNotBlank(verification) && StringUtils.isNotBlank(rightCode) && verification.equals(rightCode)) {
            //验证码通过
        } else {
            return ResultUtil.error("验证码错误！");
        }
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try{
            token.setRememberMe(1 == rememberMe);
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
        } catch (LockedAccountException e) {
            token.clear();
            return ResultUtil.error("用户已经被锁定不能登录，请联系管理员！");
        } catch (AuthenticationException e) {
            token.clear();
            return ResultUtil.error("用户名或者密码错误！");
        }
        //更新最后登录时间
        userService.updateLastLoginTime((User) SecurityUtils.getSubject().getPrincipal());
        return ResultUtil.success("登录成功！");
    }

    /*踢出*/
    @GetMapping("/kickout")
    public String kickout(Model model){
        getSysConfig(model);
        return "system/kickout";
    }

    /*登出*/
    @RequestMapping(value = "/logout")
    @ResponseBody
    public ResponseVO logout() {
        Subject subject = SecurityUtils.getSubject();
        if(null!=subject){
            String username = ((User) SecurityUtils.getSubject().getPrincipal()).getUsername();
            Serializable sessionId = SecurityUtils.getSubject().getSession().getId();
            Cache<String, Deque<Serializable>> cache = redisCacheManager.getCache(redisCacheManager.getKeyPrefix()+username);
            Deque<Serializable> deques = cache.get(username);
            for(Serializable deque : deques){
                if(sessionId.equals(deque)){
                    deques.remove(deque);
                    break;
                }
            }
            cache.put(username,deques);
        }
        subject.logout();
        return ResultUtil.success("退出成功");
    }

    /*获取当前登录用户的菜单*/
    @PostMapping("/menu")
    @ResponseBody
    public List<Permission> getMenus(){
        List<Permission> permissionListList = permissionService.selectMenuByUserId(((User) SecurityUtils.getSubject().getPrincipal()).getUserId());
        return permissionListList;
    }

    private void getSysConfig(Model model){
        System.out.println("getSysConfig =" + model);
        Map<String, String> map = configService.selectAll();
        System.out.println("config map =" + map);
        model.addAttribute("sysConfig",map);
    }




}
