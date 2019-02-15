package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizArticleLook;
import java.util.List;

public interface BizArticleLookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizArticleLook record);

    BizArticleLook selectByPrimaryKey(Integer id);

    List<BizArticleLook> selectAll();

    int updateByPrimaryKey(BizArticleLook record);
}