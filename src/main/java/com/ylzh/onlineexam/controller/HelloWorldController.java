/*
 * 
 * 
 * */
package com.ylzh.onlineexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	//method 1 http://localhost:port/hello/say
	//@RequestMapping(value = "/say",method = RequestMethod.GET)
	//method 2 http://localhost:port/hello
	@GetMapping
	public String hello() {
		return "hello world";
	}
	
}
