package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ComplexUserRepository;
import com.example.demo.model.ComplexUser;

@Controller
public class RestUserController {
	@Autowired
	ComplexUserRepository dataobject;
	@RequestMapping("/addUser")
	public ModelAndView addUser(ModelAndView mv,ComplexUser cu) {
		System.out.println(cu.toString());
		dataobject.save(cu);
		mv.setViewName("jsppages/home.jsp");
		return mv;
	}
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<ComplexUser> getUsers(){
		return dataobject.findAll();
	}
	@RequestMapping("/getUser/{id}")
	@ResponseBody
	public ComplexUser getUser(@PathVariable int id){
		Optional<ComplexUser> ret=dataobject.findById(id);
		if(ret.isEmpty()) {
			return new ComplexUser();
		}
		else {
			return ret.get();
		}
		
	}
}
