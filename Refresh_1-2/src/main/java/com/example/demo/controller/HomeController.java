package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RestUserRepo;
import com.example.demo.model.RestUser;
@RestController
public class HomeController {
@Autowired
RestUserRepo dataobject;	
@GetMapping("/getUsers")
public List<RestUser> getUsers(){
	List<RestUser> alldata=dataobject.findAll();
	return alldata;
}
}
