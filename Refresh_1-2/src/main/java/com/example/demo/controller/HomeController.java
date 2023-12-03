package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@PostMapping("/addUser")
public RestUser addUser(@RequestBody RestUser ru) {
	System.out.println(ru.toString());
	dataobject.save(ru);
	return ru;
}
@PutMapping("/replaceUser")
public RestUser replaceUser(@RequestBody RestUser ru) {
	Optional<RestUser> temp=dataobject.findById(ru.getId());
	if(!temp.isEmpty()) {
		RestUser curr=temp.get();
		curr.setId(ru.getId());
		curr.setName(ru.getName());
		curr.setPassword(ru.getPassword());
		curr.setHistexteditor(ru.getHistexteditor());
		dataobject.save(curr);
		return curr;
	}
	else {
		dataobject.save(ru);
	}
	return ru;
}
@DeleteMapping("/deleteUser/{id}")
public String deleteUser(@PathVariable int id) {
	Optional<RestUser> temp=dataobject.findById(id);
	if(temp.isEmpty()) {
		return "object doest not exist";
	}
	else {
		dataobject.deleteById(id);
		return "deleted";
	}
	
}
}
