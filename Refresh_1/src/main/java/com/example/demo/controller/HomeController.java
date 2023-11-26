package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//@RequestMapping("/")
//@ResponseBody
//public String home() {
//	return "home.jsp";
//}
@RequestMapping("/home")
public String home() {
	System.out.println("hitting");
	return "home.jsp";
}

}
