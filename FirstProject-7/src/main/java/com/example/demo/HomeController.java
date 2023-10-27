package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home(String name,HttpSession hs) {
//		HttpSession hs=req.getSession();
//		String name=req.getParameter("name");
		hs.setAttribute("name",name);
		System.out.println("name in new is "+name);
		return "home";
	}
}
