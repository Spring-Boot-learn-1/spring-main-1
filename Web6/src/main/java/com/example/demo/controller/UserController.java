package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.SimpleUserRepo;
import com.example.demo.model.SimpleUser;

@Controller
public class UserController{
	@Autowired
	SimpleUserRepo dataobject;
	@RequestMapping("/addUser")
	public String addUser(SimpleUser user){
		dataobject.save(user);
		return "home";
	}
	@RequestMapping("/getUser")
	public ModelAndView getUser(ModelAndView mv,Integer id) {
		Optional<SimpleUser> op=dataobject.findById(id);
		if(!op.isEmpty()) {
			mv.addObject("obj", op.get());
		}
		else {
			mv.addObject("obj",new SimpleUser());
		}
		System.out.println(op.get().toString());
		mv.setViewName("getuser");
		return mv;
	}
}
