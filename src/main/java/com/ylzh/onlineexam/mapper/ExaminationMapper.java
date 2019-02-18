package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.Examination;
import java.util.List;

public interface ExaminationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination
     *
     * @mbggenerated
     */
    int insert(Examination record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination
     *
     * @mbggenerated
     */
    Examination selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination
     *
     * @mbggenerated
     */
    List<Examination> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Examination record);
}