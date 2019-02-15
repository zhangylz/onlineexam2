package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizArticle;
//import com.ylzh.onlineexam.entity.BizArticleWithBLOBs;
import java.util.List;

public interface BizArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizArticle record);

    BizArticle selectByPrimaryKey(Integer id);

    List<BizArticle> selectAll();

    int updateByPrimaryKey(BizArticle record);
}