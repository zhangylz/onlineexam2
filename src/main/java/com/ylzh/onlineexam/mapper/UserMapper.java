package com.ylzh.onlineexam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ylzh.onlineexam.entity.User;

/**
 * @Auther: ylzh
 * @Date: 2019/2/15 14:55
 * @Description:
 */
//@Mapper
public interface UserMapper {

    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectById (int id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll ();
    
    List<User> findUserByUsername(String name);
}
