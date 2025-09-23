package com.spring_mvc.project;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/product/productForm3")
	public String productFormView3() {
		return "product/productForm3";
	}
	
	@RequestMapping("/product/productForm4")
	public String productFormView4() {
		return "product/productForm4";
	}
	
	@RequestMapping("/product/productSearchForm")
	public String productSearchForm() {
		return "product/productSearchForm";
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
		    //    @RequestParam("prdNo") String prdNo,
		        String prdNo, // form 태그의 파라미터명과 메소드 파타미터 변수명이 동일하면 어노테이션 생략가능
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
		
		@RequestMapping("/product/newProduct3")
		public String insertProduct3(Product product) {
			
			return "product/productResult3";
		}
		
		@RequestMapping("/product/newProduct4")
		public String insertProduct4(@ModelAttribute("productInfo")Product product) {
			
			return "product/productResult4";
		}
		
		//prdName만 전달시
		@RequestMapping("/product/productDetailView/{prdName}")
		public String productDetailView(@PathVariable String prdName) {
			System.out.println(prdName);
			return "/product/productResult";
		}
		
		//prdName, prdStock, prdNo 전달시
		@RequestMapping("/product/productDetailView/{prdName}/{prdStock}/{prdNo}")
		public String productDetailView(
				@PathVariable String prdName,
				@PathVariable String prdStock,
				@PathVariable String prdNo
				) {
			System.out.println(prdName);
			System.out.println(prdStock);
			System.out.println(prdNo);
			return "/product/productResult";
		}
		
		@RequestMapping("/product/productSearch")
		public String productSerach(@RequestParam HashMap<String, Object> param, Model model) {
			System.out.println("type");
			System.out.println("keyword");
			
			//제조회사로 검색한 결과 데이터 2개 저장
			Product product1 = new Product();
			product1.setPrdNo("P1001");
			product1.setPrdName("게이밍 노트북");
			product1.setPrdPrice(1800000);
			product1.setPrdMaker("삼성전자");
			product1.setPrdDate("2025-09-01");
			product1.setPrdStock(50);

			Product product2 = new Product();
			product2.setPrdNo("P1002");
			product2.setPrdName("무선 마우스");
			product2.setPrdPrice(35000);
			product2.setPrdMaker("삼성전자");
			product2.setPrdDate("2025-08-15");
			product2.setPrdStock(120);

			//ArrayList 활용해서 검색 결과 저장
			ArrayList<Product> prdList = new ArrayList<Product>();
			prdList.add(product1);
			prdList.add(product2);
			
			//Model 객체에 collection 저장 후 view로 전달
			model.addAttribute("prdList", prdList);
			
			return "/product/productSearchResult";
		}
}
