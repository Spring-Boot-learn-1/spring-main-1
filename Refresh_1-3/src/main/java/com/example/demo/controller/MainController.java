package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Laptop;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addLaptop")
	public ModelAndView addLaptop(Laptop lp,ModelAndView mv){
		mv.setViewName("temp.jsp");
		mv.addObject("obj1", lp);
		return mv;
	}
}
