package com.spring_mvc.mybatis2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc.mybatis2.model.BookVO;
import com.spring_mvc.mybatis2.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@RequestMapping("/")
	public String viewIndex() {
		return "index"; //메인 페이지 뷰
	}
	
	//전체 상품 조회
		@RequestMapping("/book/listAllBook")
		public String listAllBook(Model model) {
			//1. service 메소드 호출
			ArrayList<BookVO> bookList = service.listAllBook();
			
			model.addAttribute("bookList", bookList);
			
			return "book/bookListView";
		}
	
}
