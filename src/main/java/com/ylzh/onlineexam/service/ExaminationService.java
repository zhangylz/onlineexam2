package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.model.Examination;
import com.ylzh.onlineexam.vo.ExaminationConditionVO;

public interface ExaminationService extends BaseService<Examination> {
	
	/**
	 * 分页查询所有考试
	 * @param vo
	 * @return
	 */
	List<Examination> findByCondition(ExaminationConditionVO vo);
	
	/**
	 * 发布考试
	 * @param examination
	 * @return
	 */

	Examination insertExam(Examination examination);
	
}
