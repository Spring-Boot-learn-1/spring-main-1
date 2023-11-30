package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	System.out.println("hitting");
	return alldata;
}
@PostMapping("/addUser/{id}/{name}/{password}/{histexteditor}")
public RestUser addUser(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("password") String password,@PathVariable("histexteditor") String histexteditor) {
	RestUser ru=new RestUser(id,name,password,histexteditor);
	System.out.println(ru.toString());
	dataobject.save(ru);
	return ru;
}
}
