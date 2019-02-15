package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.Question;
//import com.ylzh.onlineexam.entity.QuestionWithBLOBs;
import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Question record);

    Question selectByPrimaryKey(String id);

    List<Question> selectAll();

    int updateByPrimaryKey(Question record);
}