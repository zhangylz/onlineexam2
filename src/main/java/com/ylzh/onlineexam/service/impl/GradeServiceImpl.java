package com.ylzh.onlineexam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.GradeMapper;
import com.ylzh.onlineexam.entity.Grade;
import com.ylzh.onlineexam.service.GradeService;

@Service
public class GradeServiceImpl extends BaseServiceImpl<Grade> implements GradeService {
	
	@Autowired
	private GradeMapper gradeMpper;

}
