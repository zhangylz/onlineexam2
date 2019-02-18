package com.ylzh.onlineexam.controller;

import java.util.List;

import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public int save(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @PutMapping
    public int update(@RequestBody User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @GetMapping(value = "/")
    public List<User> findAll () {
    	return userMapper.selectAll();
    }
}
