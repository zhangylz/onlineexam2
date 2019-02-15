package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.Grade;
import java.util.List;

public interface GradeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Grade record);

    Grade selectByPrimaryKey(String id);

    List<Grade> selectAll();

    int updateByPrimaryKey(Grade record);
}