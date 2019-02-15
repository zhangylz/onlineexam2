package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizLove;
import java.util.List;

public interface BizLoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizLove record);

    BizLove selectByPrimaryKey(Integer id);

    List<BizLove> selectAll();

    int updateByPrimaryKey(BizLove record);
}