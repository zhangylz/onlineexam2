package com.exam.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.mapper.QuestionMapper;
import com.exam.model.Question;
import com.exam.service.QuestionService;
import com.exam.vo.QuestionConditionVo;

@Service
public class QuestionServiceImpl extends BaseServiceImpl<Question> implements QuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public List<Question> findByCondition(QuestionConditionVo vo) {
		List<Question> list = questionMapper.findByCondition(vo);
		return list;
	}
	
	@Override
	public Question selectById(Integer id) {
		return questionMapper.selectById(id);
	}

	@Override
	public Question insertQuestion(Question question) {
		Date date = new Date();
		question.setCreateTime(date);
		question.setUpdateTime(date);
		questionMapper.insertSelective(question);
		return question;
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		return questionMapper.deleteBatch(ids);
	}


}
