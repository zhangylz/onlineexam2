package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizComment;
import com.ylzh.onlineexam.vo.CommentConditionVO;
import com.ylzh.onlineexam.util.MapperUtil;
import java.util.List;

public interface BizCommentMapper extends MapperUtil<BizComment> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    List<BizComment> selectComments(CommentConditionVO vo);

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    int deleteBatch(Integer[] ids);
}