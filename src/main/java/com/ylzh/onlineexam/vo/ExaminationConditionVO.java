package com.ylzh.onlineexam.vo;

import java.util.List;

import com.ylzh.onlineexam.vo.base.BaseConditionVO;

public class ExaminationConditionVO extends BaseConditionVO {
	
	private String keywords;
	
	private Integer subjectId;
	
	private Integer questionId;
	
	private Integer status;
	
	private List<Long> questionIds;

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	
	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Long> getQuestionIds() {
		return questionIds;
	}

	public void setQuestionIds(List<Long> questionIds) {
		this.questionIds = questionIds;
	}

}
