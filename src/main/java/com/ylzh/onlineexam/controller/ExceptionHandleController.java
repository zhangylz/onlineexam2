package com.ylzh.onlineexam.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ylzh.onlineexam.enmus.ResponseStatus;
import com.ylzh.onlineexam.exception.ArticleNotFoundException;
import com.ylzh.onlineexam.exception.ExamException;


@ControllerAdvice
public class ExceptionHandleController {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandleController.class);

    @ExceptionHandler(ExamException.class)
    public String handleZb(Exception e, HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code",ResponseStatus.ERROR.getCode());
        Map<String,Object> map = new HashMap<>(2);
        map.put("status", ResponseStatus.ERROR.getCode());
        map.put("msg", StringUtils.isNotBlank(e.getMessage())? e.getMessage() : ResponseStatus.ERROR.getMessage());
        logger.error(e.getMessage());
        request.setAttribute("ext",map);
        return "forward:/error";
    }

    @ExceptionHandler(ArticleNotFoundException.class)
    public String handleArticle(Exception e, HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code",ResponseStatus.NOT_FOUND.getCode());
        return "forward:/error";
    }
    
    @ExceptionHandler(AuthorizationException.class)
    public String handleAuth(HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code",ResponseStatus.FORBIDDEN.getCode());
        return "forward:/error";
    }


}
