package com.ylzh.onlineexam.service;

import com.ylzh.onlineexam.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     */
    int updateUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAll();
}
