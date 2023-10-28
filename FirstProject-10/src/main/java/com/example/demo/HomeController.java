package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//@RequestMapping("/")
//@ResponseBody
//public String home() {
//	return "home";
//}
//	@RequestMapping("/")
//	public String home() {
//		return "home";
//	}
//	@RequestMapping("/")
//	public String home(HttpServletRequest req) {
//		HttpSession hs=req.getSession();
//		String name=req.getParameter("name");
//		hs.setAttribute("name",name);
//		System.out.println("name is "+name);
//		return "home";
//	}
//	@RequestMapping("/")
//	public String home(String name,HttpSession hs) {
//		hs.setAttribute("name",name);
//		System.out.println("Name in this func is "+name);
//		return "home";
//	}
//	@RequestMapping("/")
//	public String home(HttpSession hs,String name) {
//		hs.setAttribute("name",name);
//		System.out.println("Name in this second func is "+name);
//		return "home";
//	}
//	@RequestMapping("/")
//	public String home(HttpSession hs,String name,int id,String laptop) {
//		hs.setAttribute("name",name);
//		hs.setAttribute("id",id);
//		hs.setAttribute("laptop", laptop);
//		System.out.println("Name in this second func is "+name);
//		return "home";
//	}
//	@RequestMapping("/")
//	public String home(HttpSession hs,Alien al) {
//		hs.setAttribute("name",al.getName());
//		hs.setAttribute("id",al.getId());
//		hs.setAttribute("laptop", al.getLaptop());
//		System.out.println("name in alien class variant is  "+al.getName());
//		return "home";
//	}
	@RequestMapping("/")
	public ModelAndView home(ModelAndView mv,Alien al) {
		mv.addObject("al",al);
		mv.setViewName("home");
		System.out.println("name in modelandview variant is  "+al.getName());
		return mv;
	}
}
