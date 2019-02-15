package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizTheme;
import java.util.List;

public interface BizThemeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizTheme record);

    BizTheme selectByPrimaryKey(Integer id);

    List<BizTheme> selectAll();

    int updateByPrimaryKey(BizTheme record);
}