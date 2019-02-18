package com.ylzh.onlineexam.vo;

import com.ylzh.onlineexam.vo.base.BaseConditionVO;

public class QuestionConditionVO extends BaseConditionVO {
	
	private Integer subjectId;
	private Integer questionType;
	private Integer status;
	private String keywords;
	
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	
	public Integer getQuestionType() {
		return questionType;
	}
	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}
