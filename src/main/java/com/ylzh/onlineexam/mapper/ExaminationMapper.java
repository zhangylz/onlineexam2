package com.ylzh.onlineexam.mapper;
import com.ylzh.onlineexam.util.MapperUtil;
import com.ylzh.onlineexam.entity.Examination;
import com.ylzh.onlineexam.vo.ExaminationConditionVO;

import java.util.List;

public interface ExaminationMapper extends MapperUtil<Examination> {

    /**
     * 分页查询考试、关联课程
     * @param vo
     * @return
     */
    List<Examination> findByCondition(ExaminationConditionVO vo);

    /**
     * 统计指定考试的题目集合
     * @param ids
     * @return
     */
    List<Examination> listQuestionsByExamId(List<Integer> ids);
}