package com.wangjihong.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("进来了！！！");
		return "index";
	}
}
