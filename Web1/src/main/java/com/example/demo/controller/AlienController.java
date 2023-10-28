package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
@Controller
public class AlienController {
	@Autowired
	AlienRepo ar;
	@RequestMapping("/addAlien")
	public String home(Alien al) {
		ar.save(al);
		return "home";
	}
}
