package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.JavaUserRepo;
import com.example.demo.model.JavaUser;

@Controller
public class UserController {
	@Autowired
	JavaUserRepo dataobject;
	@RequestMapping("/addUser")
	public String addUser(JavaUser user) {
		dataobject.save(user);
		System.out.println(user.toString());
		return "home";
	}
	@RequestMapping("/getUser")
	public ModelAndView getUser(int id) {
		ModelAndView mv=new ModelAndView("user");
		Optional<JavaUser> ju=dataobject.findById(id);
		
		System.out.println("=========1 "+ju.get().toString());
		mv.addObject("ju",ju.get());
		System.out.println(ju.toString());
		return mv;
	}
	
}
