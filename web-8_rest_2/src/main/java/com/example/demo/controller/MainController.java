package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.RestUserRepo;
import com.example.demo.model.RestUser;

@Controller
public class MainController {
	@Autowired
	RestUserRepo dataobjectru;
	@RequestMapping("/home")
	public String home()
	{
		return "jsppages/home.jsp";
	}
	@RequestMapping("/addUser")
	public ModelAndView addUser(ModelAndView mv,RestUser ru) {
		dataobjectru.save(ru);
		mv.setViewName("jsppages/home.jsp");
		return mv;
	}
	@RequestMapping("/getUser/{id}")
	@ResponseBody
	public RestUser getUser(@PathVariable int id) {
		System.out.println("123 "+id);
		Optional<RestUser> ru=dataobjectru.findById(id);
		if(ru.isEmpty()) {
			return new RestUser();
		}
		else {
			return ru.get();
		}
	}
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<RestUser> getUsers() {
		
		return dataobjectru.findAll();
	}
}
