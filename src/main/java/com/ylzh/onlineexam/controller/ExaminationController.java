package com.ylzh.onlineexam.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ylzh.onlineexam.entity.Examination;
import com.ylzh.onlineexam.entity.Subject;
import com.ylzh.onlineexam.entity.User;
import com.ylzh.onlineexam.service.ExamQuestionService;
import com.ylzh.onlineexam.service.ExaminationService;
import com.ylzh.onlineexam.service.QuestionService;
import com.ylzh.onlineexam.service.SubjectService;
import com.ylzh.onlineexam.util.CoreConst;
import com.ylzh.onlineexam.util.PageUtil;
import com.ylzh.onlineexam.util.ResultUtil;
import com.ylzh.onlineexam.vo.ExaminationConditionVO;
import com.ylzh.onlineexam.vo.base.PageResultVO;
import com.ylzh.onlineexam.vo.base.ResponseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("exam")
public class ExaminationController {
	
	@Autowired
	private ExaminationService examService;
	
	@Autowired
	private SubjectService subjectSevice;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private ExamQuestionService examQuestionSevice;

	@PostMapping("list")
	@ResponseBody
	public PageResultVO loadExam(ExaminationConditionVO examConditionVo, Integer limit, Integer offset) {
		PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);
		List<Examination> examList = examService.findByCondition(examConditionVo);
		PageInfo<Examination> pages = new PageInfo<>(examList);
		return ResultUtil.table(examList, pages.getTotal());
	}
	
	@GetMapping("/add")
	public String addExam(Model model) {
		Subject subject = new Subject();
		subject.setStatus(CoreConst.STATUS_VALID);
		List<Subject> subjects = subjectSevice.selectSubjects(subject);
		model.addAttribute("subjects", JSON.toJSONString(subjects));
		return "exam/publish";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseVO add(Examination examination,Integer[]question) {
		try {
			User user = (User)SecurityUtils.getSubject().getPrincipal();
			examination.setUserId(user.getUserId());
			examination.setAuthor(user.getNickname());
			Examination exam = examService.insertExam(examination);
			examQuestionSevice.insertList(exam.getId(),question);
			return ResultUtil.success("发布考试成功");
		} catch (Exception e) {
			return ResultUtil.error("发布考试失败");
		}
	}
	
}