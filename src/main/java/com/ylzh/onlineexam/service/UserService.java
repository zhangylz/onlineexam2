package com.ylzh.onlineexam.service;

import java.io.Serializable;
import java.util.List;

import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.vo.UserOnlineVO;
import com.ylzh.onlineexam.vo.base.ResponseVO;

public interface UserService {

    /**
     * 根据用户名查询用户
     * @param username
     * @return user
     */
    User selectByUsername(String username);

    /**
     * 注册用户
     * @param user
     * @return int
     */
    int register(User user);

    /**
     * 更新最后登录时间
     * @param user
     */
    void updateLastLoginTime(User user);

    /**
     * 根据条件查询用户列表
     * @param user
     * @return list
     */
    List<User> selectUsers(User user);

    /**
     * 根据用户id查询用户
     * @param userId
     * @return user
     */
    User selectByUserId(String userId);

    /**
     * 根据用户id更新用户信息
     * @param user
     * @return int
     */
    int updateByUserId(User user);

    /**
     * 根据用户id集合批量更新用户状态
     * @param userIds
     * @param status
     * @return int
     */
    int updateStatusBatch(List<String> userIds, Integer status);

    /**
     * 根据用户id分配角色集合
     * @param userId
     * @param roleIds
     * @return int
     */
    ResponseVO addAssignRole(String userId, List<String> roleIds);

    /**
     * 根据主键更新用户信息
     * @param user
     * @return int
     */
    int updateUserByPrimaryKey(User user);


    List<UserOnlineVO> selectOnlineUsers(UserOnlineVO userOnlineVo);


    void kickout(Serializable sessionId, String username);

}
