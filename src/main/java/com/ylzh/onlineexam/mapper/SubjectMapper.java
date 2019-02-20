package com.ylzh.onlineexam.mapper;
import com.ylzh.onlineexam.util.MapperUtil;
import com.ylzh.onlineexam.entity.Subject;

import java.util.List;

public interface SubjectMapper extends MapperUtil<Subject> {

    List<Subject> selectSubjects(Subject subject);

    int deleteBatch(Integer[] ids);

    Subject selectById(Integer id);
}