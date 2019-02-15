package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizCategory;
import java.util.List;

public interface BizCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizCategory record);

    BizCategory selectByPrimaryKey(Integer id);

    List<BizCategory> selectAll();

    int updateByPrimaryKey(BizCategory record);
}