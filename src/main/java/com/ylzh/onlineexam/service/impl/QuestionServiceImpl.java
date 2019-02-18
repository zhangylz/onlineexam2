package com.ylzh.onlineexam.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.QuestionMapper;
import com.ylzh.onlineexam.entity.Question;
import com.ylzh.onlineexam.service.QuestionService;
import com.ylzh.onlineexam.vo.QuestionConditionVO;

@Service
public class QuestionServiceImpl extends BaseServiceImpl<Question> implements QuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public List<Question> findByCondition(QuestionConditionVO vo) {
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
