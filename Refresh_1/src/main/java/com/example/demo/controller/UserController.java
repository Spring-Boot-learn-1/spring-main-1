package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.NormalUser;

@Controller
public class UserController {
	@RequestMapping("/")
	public ModelAndView addUserForm(ModelAndView mv) {
		mv.setViewName("addUserForm");

		return mv;
	}
@RequestMapping("/addUser")
public ModelAndView addUser(NormalUser nu,ModelAndView mv) {
	mv.setViewName("showdatadirectly");
	mv.addObject("obj", nu);
	return mv;
}

}
