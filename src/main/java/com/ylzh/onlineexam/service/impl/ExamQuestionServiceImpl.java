package com.ylzh.onlineexam.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.ExamQuestionMapper;
import com.ylzh.onlineexam.entity.ExamQuestion;
import com.ylzh.onlineexam.service.ExamQuestionService;

import tk.mybatis.mapper.entity.Example;

@Service
public class ExamQuestionServiceImpl extends BaseServiceImpl<ExamQuestion> implements ExamQuestionService {

	@Autowired
	private ExamQuestionMapper examQuestionMapper;
	
	
	@Override
	public int removeByExamId(Integer examId) {
		return examQuestionMapper.deleteByExampleId(examId);
	}

	@Override
	public void insertList(Integer examId, Integer[] questionIds) {
		Date date = new Date();
		List<ExamQuestion> examQuestions = new ArrayList<>();
		for(Integer questionId : questionIds) {
			ExamQuestion examQuestion = new ExamQuestion();
			examQuestion.setExamId(examId);
			examQuestion.setQuestionId(questionId);
			examQuestion.setCreateTime(date);
			examQuestion.setUpdateTime(date);
			examQuestionMapper.insert(examQuestion);
		}
	}

}
