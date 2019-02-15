package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizComment;
import java.util.List;

public interface BizCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizComment record);

    BizComment selectByPrimaryKey(Integer id);

    List<BizComment> selectAll();

    int updateByPrimaryKey(BizComment record);
}