package cn.ethan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		System.out.println("进入");
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","hello SpringMVC");
		mav.setViewName("/WEB-INF/hello.jsp");
		return mav;
	}
}
