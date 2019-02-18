package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizCategory;
import com.ylzh.onlineexam.util.MapperUtil;

import java.util.List;

public interface BizCategoryMapper extends MapperUtil<BizCategory> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_category
     *
     * @mbggenerated
     */
    int insert(BizCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_category
     *
     * @mbggenerated
     */
    BizCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_category
     *
     * @mbggenerated
     */
    List<BizCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BizCategory record);

    List<BizCategory> selectCategories(BizCategory bizCategory);

    int deleteBatch(Integer[] ids);

    BizCategory selectById(Integer id);
}