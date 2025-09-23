package com.spring_mvc.project;

public class Product {


	    private String prdNo;     // 상품번호
	    private String prdName;   // 상품명
	    private int prdPrice;     // 가격
	    private String prdMaker;  // 제조회사
	    private String prdDate;   // 제조일
	    private int prdStock;     // 재고
	    
		public String getPrdNo() {
			return prdNo;
		}
		public void setPrdNo(String prdNo) {
			this.prdNo = prdNo;
		}
		public String getPrdName() {
			return prdName;
		}
		public void setPrdName(String prdName) {
			this.prdName = prdName;
		}
		public int getPrdPrice() {
			return prdPrice;
		}
		public void setPrdPrice(int prdPrice) {
			this.prdPrice = prdPrice;
		}
		public String getPrdMaker() {
			return prdMaker;
		}
		public void setPrdMaker(String prdMaker) {
			this.prdMaker = prdMaker;
		}
		public String getPrdDate() {
			return prdDate;
		}
		public void setPrdDate(String prdDate) {
			this.prdDate = prdDate;
		}
		public int getPrdStock() {
			return prdStock;
		}
		public void setPrdStock(int prdStock) {
			this.prdStock = prdStock;
		}
	    
	    
}
