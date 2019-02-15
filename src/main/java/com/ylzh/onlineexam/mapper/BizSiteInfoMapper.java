package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizSiteInfo;
import java.util.List;

public interface BizSiteInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizSiteInfo record);

    BizSiteInfo selectByPrimaryKey(Integer id);

    List<BizSiteInfo> selectAll();

    int updateByPrimaryKey(BizSiteInfo record);
}