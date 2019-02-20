package com.ylzh.onlineexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ylzh.onlineexam.entity.Question;
import com.ylzh.onlineexam.entity.Subject;
import com.ylzh.onlineexam.service.QuestionService;
import com.ylzh.onlineexam.service.SubjectService;
import com.ylzh.onlineexam.util.CoreConst;
import com.ylzh.onlineexam.util.PageUtil;
import com.ylzh.onlineexam.util.ResultUtil;
import com.ylzh.onlineexam.vo.QuestionConditionVO;
import com.ylzh.onlineexam.vo.base.PageResultVO;
import com.ylzh.onlineexam.vo.base.ResponseVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("list")
	@ResponseBody
	public PageResultVO loadQuestion(QuestionConditionVO questionConditionVo, Integer limit, Integer offset) {
		PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);
		List<Question> questionList = questionService.findByCondition(questionConditionVo);
		PageInfo<Question> pages = new PageInfo<>(questionList);
		return ResultUtil.table(questionList, pages.getTotal());
	}
	//添加题目
	@GetMapping("/add")
	public String addQuestion(Model model) {
		Subject subject = new Subject();
		subject.setStatus(CoreConst.STATUS_VALID);
		List<Subject> subjects = subjectService.selectSubjects(subject);
		model.addAttribute("subjects", JSON.toJSONString(subjects));
		return "question/add";
	}
	
    @PostMapping("/add")
    @ResponseBody
    public ResponseVO add(Question question) {
    	try {
			Question questions = questionService.insertQuestion(question);
			return ResultUtil.success("新增题目成功！");
		} catch (Exception e) {
			return ResultUtil.error("新增题目失败！");
		}
    }
    
    @GetMapping("/edit")
    public String edit(Model model, Integer id) {
    	Question question = questionService.selectById(id);
    	model.addAttribute("question", question);
    	Subject subject = new Subject();
    	subject.setStatus(CoreConst.STATUS_VALID);
    	List<Subject> subjects = subjectService.selectSubjects(subject);
    	model.addAttribute("subjects", JSON.toJSONString(subjects));
    	return "question/detail";
    }
    
    @PostMapping("/edit")
    @ResponseBody
    public ResponseVO edit(Question question) {
    	questionService.updateNotNull(question);
    	return ResultUtil.success("编辑题目成功");
    }
    
    
    @PostMapping("/delete")
    @ResponseBody
    public ResponseVO delete(Integer id) {
    	int i = questionService.deleteBatch(new Integer[]{id});
    	if(i > 0) {
    		return ResultUtil.success("删除题目成功");
    	}else {
    		return ResultUtil.error("删除题目失败");
    	}
    }
    
    @PostMapping("/batch/delete")
    @ResponseBody
    public ResponseVO deleteBatch(@RequestParam("ids[]") Integer[]ids) {
    	int i = questionService.deleteBatch(ids);
    	if(i > 0) {
    		return ResultUtil.success("批量删除题目成功");
    	}else {
    		return ResultUtil.error("批量删除题目失败");
    	}
    }
}
