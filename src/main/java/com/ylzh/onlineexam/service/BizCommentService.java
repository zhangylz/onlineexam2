package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.BizComment;
import com.ylzh.onlineexam.vo.CommentConditionVO;

public interface BizCommentService extends BaseService<BizComment> {
    List<BizComment> selectComments(CommentConditionVO vo);

    int deleteBatch(Integer[]ids);

}
