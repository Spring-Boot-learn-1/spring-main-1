package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.JavaUserRepo;
import com.example.demo.model.JavaUser;

@Controller
public class JavaUserController {
	@Autowired
	JavaUserRepo dataobject;
@RequestMapping("/addUser")
public String adduser(JavaUser user) {
	dataobject.save(user);
	return "home";
}
}
