package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//	@RequestMapping("home")
//	
//	public String home() {
//		return "home";
//	}

//	@RequestMapping("home")	
//	public String home(HttpServletRequest req) {
//		HttpSession hs=req.getSession();
//		String name=req.getParameter("name");
//		hs.setAttribute("name",name);
//		return "home";
//	}
	
//	@RequestMapping("home")	
//	public String home(String name,int id,String laptop,HttpSession hs) {
//		hs.setAttribute("name",name);
//		hs.setAttribute("id",id*12);
//		hs.setAttribute("laptop",laptop);
//		System.out.println(name);
//		return "home";
//	}
	@RequestMapping("home")	
	public ModelAndView home(Alien al) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		mv.addObject("al", al);
		System.out.println(al.toString());
		return mv;
	}
}
