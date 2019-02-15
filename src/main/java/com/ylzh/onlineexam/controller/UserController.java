package com.ylzh.onlineexam.controller;

import java.util.List;

import com.ylzh.onlineexam.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ylzh.onlineexam.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public int save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping
    public int update(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(value = "/")
    public List<User> findAll () {
    	return userService.queryAll();
    }
}
