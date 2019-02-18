package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizTags;
import com.ylzh.onlineexam.util.MapperUtil;

import java.util.List;

public interface BizTagsMapper extends MapperUtil<BizTags> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_tags
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_tags
     *
     * @mbggenerated
     */
    int insert(BizTags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_tags
     *
     * @mbggenerated
     */
    BizTags selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_tags
     *
     * @mbggenerated
     */
    List<BizTags> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_tags
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BizTags record);

    List<BizTags> selectTags(BizTags bizTags);

    int deleteBatch(Integer[] ids);
}