package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.JavaUser;

@Controller
public class UserController {

	@RequestMapping("/addUser")
	public String addUser(JavaUser user) {
		System.out.println(user.toString());
		return "home";
	}
	
}
