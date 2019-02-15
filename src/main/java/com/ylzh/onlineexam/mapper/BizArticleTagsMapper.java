package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizArticleTags;
import java.util.List;

public interface BizArticleTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizArticleTags record);

    BizArticleTags selectByPrimaryKey(Integer id);

    List<BizArticleTags> selectAll();

    int updateByPrimaryKey(BizArticleTags record);
}