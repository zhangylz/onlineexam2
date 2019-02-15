package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.Role;
import java.util.List;

public interface RoleMapper {
    int insert(Role record);

    List<Role> selectAll();
}