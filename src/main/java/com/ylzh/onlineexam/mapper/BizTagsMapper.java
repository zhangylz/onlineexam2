package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizTags;
import java.util.List;

public interface BizTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizTags record);

    BizTags selectByPrimaryKey(Integer id);

    List<BizTags> selectAll();

    int updateByPrimaryKey(BizTags record);
}