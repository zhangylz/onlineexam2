package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizLink;
import java.util.List;

public interface BizLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizLink record);

    BizLink selectByPrimaryKey(Integer id);

    List<BizLink> selectAll();

    int updateByPrimaryKey(BizLink record);
}