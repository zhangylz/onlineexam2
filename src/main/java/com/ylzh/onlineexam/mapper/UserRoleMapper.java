package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.UserRole;
import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer roleId);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}