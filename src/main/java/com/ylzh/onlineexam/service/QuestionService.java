package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.Question;
import com.ylzh.onlineexam.vo.QuestionConditionVO;

public interface QuestionService extends BaseService<Question> {
	
	/**
	 * 分页查询
	 * @param vo
	 * @return
	 */
	List<Question> findByCondition(QuestionConditionVO vo);
	
	/**
	 * 根据id获取题目
	 * @param id
	 * @return
	 */
	Question selectById(Integer id);
	
	/**
	 * 插入
	 * @param question
	 * @return
	 */
	Question insertQuestion(Question question);
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	int deleteBatch(Integer[] ids);

}
