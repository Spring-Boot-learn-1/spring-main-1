package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.JavaUser;

@Controller
public class UserController {
	@Autowired
	UserRepo ur;
@RequestMapping("/addUser")
public String addUser(JavaUser user) {
	System.out.println(user.toString());
	ur.save(user);
	return "home";
}
}
