package com.ylzh.onlineexam.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ylzh.onlineexam.service.SysConfigService;
import com.ylzh.onlineexam.util.CoreConst;

/**
 * js调用 thymeleaf 实现按钮权限
 * 
 */
@Component("module")
public class ModuleService {
    @Autowired
    private SysConfigService sysConfigService;

    public Object get(String moduleName){
        switch (moduleName){
            case "sysConfig":           //网站基本信息配置
                return sysConfigService.selectAll();
            default:
                return null;
        }
    }
}
