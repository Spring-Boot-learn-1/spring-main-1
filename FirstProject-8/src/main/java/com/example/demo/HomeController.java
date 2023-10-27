package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//@RequestMapping("home")
//public String home(HttpServletRequest req) {
//	HttpSession hs=req.getSession();
//	String name=req.getParameter("name");
//	hs.setAttribute("name",name);
//	System.out.println("name is "+name);
//	return "home";
//}
	//++++++++++++++++++++++check this it is a much better way than above++++++++++++++++++++
//	@RequestMapping("home")
//	public String home(String name,int id,String laptop,HttpSession hs) {
//		hs.setAttribute("name",name);
//		hs.setAttribute("id",id*10);
//		hs.setAttribute("laptop",laptop);
//		System.out.println("name is "+name+" id is "+id+" laptop is "+laptop);
//		return "home";
//	}	
	//+++++++++++++++++++++check this it is even better way than above++++++++++++++++++++++
	@RequestMapping("home")
	public ModelAndView home(ModelAndView mv,Alien al) {
		mv.addObject("al",al);
		System.out.print(al.toString());
		mv.setViewName("home");
		return mv;
	}	
}
