package com.ylzh.onlineexam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.save(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.save(user);
    }

    @Override
    public User getById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getByUserName(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.selectAll();
    }

    @Override
    public void deleteById(int id) {
        userMapper.deleteById(id);
    }
}