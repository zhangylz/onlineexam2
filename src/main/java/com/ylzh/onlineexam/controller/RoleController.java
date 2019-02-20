package com.ylzh.onlineexam.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylzh.onlineexam.entity.Permission;
import com.ylzh.onlineexam.entity.Role;
import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.service.PermissionService;
import com.ylzh.onlineexam.service.RoleService;
import com.ylzh.onlineexam.shiro.ShiroRealm;
import com.ylzh.onlineexam.util.CoreConst;
import com.ylzh.onlineexam.util.PageUtil;
import com.ylzh.onlineexam.util.ResultUtil;
import com.ylzh.onlineexam.vo.PermissionTreeListVO;
import com.ylzh.onlineexam.vo.base.PageResultVO;
import com.ylzh.onlineexam.vo.base.ResponseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/role")
public class RoleController{
    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private ShiroRealm shiroRealm;

    /*角色列表数据*/
    @PostMapping("/list")
    @ResponseBody
    public PageResultVO pageRoles(Role role,Integer limit,Integer offset) {
        try {
            PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);
            List<Role> roleList = roleService.selectRoles(role);
            PageInfo<Role> pages = new PageInfo<>(roleList);
            return ResultUtil.table(roleList,pages.getTotal());
        } catch (Exception e) {
            logger.error(String.format("RoleController.loadRoles%s", e));
            throw e;
        }

    }

    /*新增角色*/
    @PostMapping("/add")
    @ResponseBody
    public ResponseVO addRole(Role role) {
        try {
            int a = roleService.insert(role);
            if (a > 0) {
                return ResultUtil.success("添加角色成功");
            } else {
                return ResultUtil.error("添加角色失败");
            }
        } catch (Exception e) {
            logger.error(String.format("RoleController.addRole%s", e));
            throw e;
        }
    }

    /*删除角色*/
    @GetMapping("/delete")
    @ResponseBody
    public ResponseVO deleteRole(String roleId) {
        if(roleService.findByRoleId(roleId).size()>0){
            return ResultUtil.error("删除失败,该角色下存在用户");
        }
        List<String> roleIdsList = Arrays.asList(roleId);
        int a = roleService.updateStatusBatch(roleIdsList, CoreConst.STATUS_INVALID);
        if (a > 0) {
            return ResultUtil.success("删除角色成功");
        } else {
            return ResultUtil.error("删除角色失败");
        }
    }

    /*批量删除角色*/
    @GetMapping("/batch/delete")
    @ResponseBody
    public ResponseVO batchDeleteRole(String roleIdStr) {
        String[] roleIds = roleIdStr.split(",");
        List<String> roleIdsList = Arrays.asList(roleIds);
        if(roleService.findByRoleIds(roleIdsList).size()>0){
            return ResultUtil.error("删除失败,选择的角色下存在用户");
        }
        int a = roleService.updateStatusBatch(roleIdsList,CoreConst.STATUS_INVALID);
        if (a > 0) {
            return ResultUtil.success("删除角色成功");
        } else {
            return ResultUtil.error("删除角色失败");
        }
    }

    /*编辑角色详情*/
    @GetMapping("/edit")
    public String detail(Model model, Integer id) {
        Role role = roleService.findById(id);
        model.addAttribute("role", role);
        return "role/detail";
    }

    /*编辑角色*/
    @PostMapping("/edit")
    @ResponseBody
    public ResponseVO editRole(@ModelAttribute("role") Role role) {
        int a = roleService.updateByRoleId(role);
        if (a > 0) {
            return ResultUtil.success("编辑角色成功");
        } else {
            return ResultUtil.error("编辑角色失败");
        }
    }

    /*分配权限列表查询*/
    @PostMapping("/assign/permission/list")
    @ResponseBody
    public List<PermissionTreeListVO> assignRole(String roleId){
        List<PermissionTreeListVO> listVos = new ArrayList<>();
        List<Permission> allPermissions = permissionService.selectAll(CoreConst.STATUS_VALID);
        List<Permission> hasPermissions = roleService.findPermissionsByRoleId(roleId);
        for(Permission permission : allPermissions){
            PermissionTreeListVO vo = new PermissionTreeListVO();
            vo.setId(permission.getId());
            vo.setPermissionId(permission.getPermissionId());
            vo.setName(permission.getName());
            vo.setParentId(permission.getParentId());
            for(Permission hasPermission:hasPermissions){
                //有权限则选中
                if(hasPermission.getPermissionId().equals(permission.getPermissionId())){
                    vo.setChecked(true);
                    break;
                }
            }
            listVos.add(vo);
        }
        return listVos;
    }


    /*分配权限*/
    @PostMapping("/assign/permission")
    @ResponseBody
    public ResponseVO assignRole(String roleId, String permissionIdStr){
        List<String> permissionIdsList = new ArrayList<>();
        if(StringUtils.isNotBlank(permissionIdStr)){
            String[] permissionIds = permissionIdStr.split(",");
            permissionIdsList = Arrays.asList(permissionIds);
        }
        ResponseVO responseVo = roleService.addAssignPermission(roleId,permissionIdsList);
        /*重新加载角色下所有用户权限*/
        List<User> userList = roleService.findByRoleId(roleId);
        if(userList.size()>0){
            List<String> userIds = new ArrayList<>();
            for(User user : userList){
                userIds.add(user.getUserId());
            }
            shiroRealm.clearAuthorizationByUserId(userIds);
        }
        return responseVo;
    }

}
