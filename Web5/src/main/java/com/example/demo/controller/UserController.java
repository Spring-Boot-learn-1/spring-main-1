package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.SimpleUserRepo;
import com.example.demo.model.SimpleUser;

@Controller
public class UserController {
	@Autowired
	SimpleUserRepo SimpleUserDataObject;
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(ModelAndView mv,SimpleUser su) {
		SimpleUserDataObject.save(su);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/getUser")
	public ModelAndView getUser(ModelAndView mv,int id) {
		
		Optional<SimpleUser> op=SimpleUserDataObject.findById(id);
		SimpleUser su=new SimpleUser();
		if (!op.isEmpty()){
			su=op.get();
		}
		mv.addObject("obj", su);
		mv.setViewName("showuser");
		return mv;
	}
}
