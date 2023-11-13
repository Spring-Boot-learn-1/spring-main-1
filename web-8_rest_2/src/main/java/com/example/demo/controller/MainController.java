package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.RestUserRepo;
import com.example.demo.model.RestUser;

@Controller
public class MainController {
	@Autowired
	RestUserRepo dataobjectru;
	@RequestMapping("/")
	public String home()
	{
		
		return "jsppages/home.jsp";
	}
	@RequestMapping("/addUser")
	public ModelAndView addUser(ModelAndView mv,RestUser ru) {
		dataobjectru.save(ru);
		mv.setViewName("jsppages/home.jsp.jsp");
		return mv;
	}
	@RequestMapping("/getUser")
	@ResponseBody
	public String getUser() {
		return "";
	}
}
