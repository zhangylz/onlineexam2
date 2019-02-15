package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.Examination;
import java.util.List;

public interface ExaminationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Examination record);

    Examination selectByPrimaryKey(Integer id);

    List<Examination> selectAll();

    int updateByPrimaryKey(Examination record);
}