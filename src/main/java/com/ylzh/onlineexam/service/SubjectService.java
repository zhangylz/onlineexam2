package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.Subject;

public interface SubjectService extends BaseService<Subject> {
	
	List<Subject> selectSubjects(Subject subject);
    int deleteBatch(Integer[] ids);
    Subject selectById(Integer id);

}
