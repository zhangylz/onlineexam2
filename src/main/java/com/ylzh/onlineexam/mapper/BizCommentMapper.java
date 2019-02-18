package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizComment;
import com.ylzh.onlineexam.util.MapperUtil;
import com.ylzh.onlineexam.vo.CommentConditionVO;

import java.util.List;

public interface BizCommentMapper extends MapperUtil<BizComment> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_comment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_comment
     *
     * @mbggenerated
     */
    int insert(BizComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_comment
     *
     * @mbggenerated
     */
    BizComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_comment
     *
     * @mbggenerated
     */
    List<BizComment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BizComment record);

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