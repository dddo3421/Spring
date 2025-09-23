package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	
	@RequestMapping("/bookInfoView1") //http://localhost:8080/project/bookInfoView1
	public String showBookInfo1(Model model) {
		model.addAttribute("title", "스프링 프레임워크");
		model.addAttribute("price", 20000);
		return "book/bookInfoView"; // 해당 문자열이 프런트컨트롤러로 반환되면서 model 객체도 같이 전송됨
	}
	
	@RequestMapping("/bookInfoView2")
	public ModelAndView showBookInfo2(ModelAndView mv) {
		mv.addObject("title", "자바의 기초");
		mv.addObject("price", 35000);
		mv.setViewName("book/bookInfoView");
		return mv;
	}
	
	//다중맵핑
	@RequestMapping(value= {"/bookInfoView3", "/bookInfoView4"})
	public String showBookInfo34(HttpServletRequest request, Model model) {
		if(request.getServletPath().equals("/book/bookInfoView3")) {
			model.addAttribute("title", "스프링 프레임워크");
			model.addAttribute("price", 20000);
		}else {
			model.addAttribute("title", "자바의 기초");
			model.addAttribute("price", 34000);
		}
		
		return "book/bookInfoView";
	}
	
}
