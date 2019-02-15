package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.User;

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
     * 根据id获取用户
     * @param id
     * @return
     */
    User getById(int id);

    /**
     * 根据名称获取用户
     * @param username
     * @return
     */
    List<User> getByUserName(String username);

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAll();

    /**
     * 根据id删除用户信息
     * @param id
     */
    void deleteById(int id);
}
