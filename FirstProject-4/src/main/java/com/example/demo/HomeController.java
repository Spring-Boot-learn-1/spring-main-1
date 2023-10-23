package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("hello")
//	@ResponseBody
	public String home() {
		System.out.println("in home of code for not showing why");
		return "Home.jsp";
	}
}
