package com.ylzh.onlineexam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.BizCommentMapper;
import com.ylzh.onlineexam.entity.BizComment;
import com.ylzh.onlineexam.service.BizCommentService;
import com.ylzh.onlineexam.vo.CommentConditionVO;

@Service
public class BizCommentServiceImpl extends BaseServiceImpl<BizComment> implements BizCommentService {
    @Autowired
    private BizCommentMapper commentMapper;
    @Override
    public List<BizComment> selectComments(CommentConditionVO vo) {
        return commentMapper.selectComments(vo);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return commentMapper.deleteBatch(ids);
    }
}
