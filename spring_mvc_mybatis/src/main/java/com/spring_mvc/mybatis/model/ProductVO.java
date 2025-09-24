package com.spring_mvc.mybatis.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductVO {
	// 필드명 : 파라미터명과 일치, db 테이블의 컬럼명과 일치
	private String prdNo; // 상품번호
	private String prdName; // 상품명
	private int prdPrice; // 가격
	private String prdCompany; // 제조회사
	private int prdStock; // 재고
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date prdDate; // 제조일

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

	public String getPrdCompany() {
		return prdCompany;
	}

	public void setPrdCompany(String prdCompany) {
		this.prdCompany = prdCompany;
	}

	public int getPrdStock() {
		return prdStock;
	}

	public void setPrdStock(int prdStock) {
		this.prdStock = prdStock;
	}

	public Date getPrdDate() {
		return prdDate;
	}

	public void setPrdDate(Date prdDate) {
		this.prdDate = prdDate;
	}
}
