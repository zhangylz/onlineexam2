package com.ylzh.onlineexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ylzh.onlineexam.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    /**
     * 根据用户名查找用户信息
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
