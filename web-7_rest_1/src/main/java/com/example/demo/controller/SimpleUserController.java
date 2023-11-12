package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.SimpleUserRepository;
import com.example.demo.model.SimpleUser;

@Controller
public class SimpleUserController {
	@Autowired
	SimpleUserRepository userdataobject;
	@RequestMapping("/addUser")
	public String addUser(SimpleUser su) {
		userdataobject.save(su);
		return "pages/home.jsp";
	}
	
	@RequestMapping("/getUser/{id}")
	@ResponseBody
	public String getUser(@PathVariable("id") int id) {
		Optional<SimpleUser> su=userdataobject.findById(id);
	
		if(!su.isEmpty()) {
			return su.get().toString();
		}
		else {
			return "";
		}
	}
	@RequestMapping("/getAllUsers")
	@ResponseBody
	public List<SimpleUser> getAllUsers() {
		
		List<SimpleUser> sus=userdataobject.findAll();
		System.out.println(sus);
		return sus;
	}
	
}
