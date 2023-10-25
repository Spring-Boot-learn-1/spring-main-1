package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Controller
public class HomeController {
@RequestMapping("home")
//@ResponseBody//it will make sure only print string not return by home function not the home.jsp if uncommented
public String Home(HttpServletRequest req,HttpServletResponse rep) {
	System.out.println("in trail");
	String temp=req.getParameter("name");
	System.out.println("name in http "+temp);
	
	return "home";
}
}
