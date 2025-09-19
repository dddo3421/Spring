package com.spring_mvc.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@RequestMapping("/product/productForm")
	public String productFormView() {
		return "product/productForm";
	}
	
	@RequestMapping("/product/productForm2")
	public String productFormView2() {
		return "product/productForm2";
	}
		
		@RequestMapping("/product/newProduct")
		public String insertProduct(HttpServletRequest request, Model model) {
			String prdNo      = request.getParameter("prdNo");
			String prdName    = request.getParameter("prdName");
			String prdPrice   = request.getParameter("prdPrice");
			String prdCompany = request.getParameter("prdCompany");
			String prdDate    = request.getParameter("prdDate");
			String prdStock   = request.getParameter("prdStock");
			
			model.addAttribute("prdNo", prdNo);
			model.addAttribute("prdName", prdName);
			model.addAttribute("prdPrice", prdPrice);
			model.addAttribute("prdCompany", prdCompany);
			model.addAttribute("prdDate", prdDate);
			model.addAttribute("prdStock", prdStock);
			
			return "product/productResult";
		}
	
		@RequestMapping("/product/newProduct2")
		public String insertProduct2(
		        @RequestParam("prdNo") String prdNo,
		        @RequestParam("prdName") String prdName,
		        @RequestParam("prdPrice") String prdPrice,
		        @RequestParam("prdCompany") String prdCompany,
		        @RequestParam("prdDate") String prdDate,
		        @RequestParam("prdStock") String prdStock,
		        Model model) {

		  
		    model.addAttribute("prdNo", prdNo);
		    model.addAttribute("prdName", prdName);
		    model.addAttribute("prdPrice", prdPrice);
		    model.addAttribute("prdCompany", prdCompany);
		    model.addAttribute("prdDate", prdDate);
		    model.addAttribute("prdStock", prdStock);

		    return "product/productResult";
		}
		
}
