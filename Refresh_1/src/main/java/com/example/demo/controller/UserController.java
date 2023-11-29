package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.NormalUserRepo;
import com.example.demo.model.NormalUser;

@Controller
public class UserController {
	@Autowired
	NormalUserRepo dataobject;
	@RequestMapping("/")
	public ModelAndView addUserForm(ModelAndView mv) {
		mv.setViewName("addUserForm");
		return mv;
	}
@RequestMapping("/addUser")
public ModelAndView addUser(NormalUser nu,ModelAndView mv) {
	mv.setViewName("showdatadirectly");
	mv.addObject("obj", nu);
	dataobject.save(nu);
	return mv;
}
@RequestMapping("/getUsers")
@ResponseBody
public List<NormalUser> getUsers() {
	List<NormalUser> lnu=dataobject.findAll();
	return lnu;
}
}
