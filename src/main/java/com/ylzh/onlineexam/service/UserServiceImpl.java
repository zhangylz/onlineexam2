package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.selectAll();
    }

}