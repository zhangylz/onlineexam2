package com.ylzh.onlineexam.model;

import com.ylzh.onlineexam.vo.base.BaseVO;

public class ExamQuestion extends BaseVO {
	
	private Integer examId;
	
	private Integer questionId;

	public Integer getExamId() {
		return examId;
	}
	
	public void setExamId(Integer examId) {
		this.examId = examId;
	}
	
	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}


}
