package com.ylzh.onlineexam.util;

import java.util.List;

import com.ylzh.onlineexam.vo.base.PageResultVO;
import com.ylzh.onlineexam.vo.base.ResponseVO;

public class ResultUtil{

	public static ResponseVO success(){
		return vo(CoreConst.SUCCESS_CODE,null,null);
	}

	public static ResponseVO success(String msg){
		return vo(CoreConst.SUCCESS_CODE, msg,null);
	}

	public static ResponseVO success(String msg, Object data){
		return vo(CoreConst.SUCCESS_CODE, msg, data);
	}

	public static ResponseVO error(){
		return vo(CoreConst.FAIL_CODE,null,null);
	}

	public static ResponseVO error(String msg){
		return vo(CoreConst.FAIL_CODE, msg,null);
	}

	public static ResponseVO error(String msg, Object data){
		return vo(CoreConst.FAIL_CODE, msg,data);
	}

	public static PageResultVO table( List<?> list, Long total){
		return new PageResultVO(list, total);
	}

	public static ResponseVO vo(Integer status, String message, Object data) {
		return new ResponseVO<>(status, message, data);
	}



}
