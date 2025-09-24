package com.spring.mvcProject2.dto;

public class ProductDTO {
    
    private String prdNo;       // 상품번호 (PRDNO)
    private String prdName;     // 상품명 (PRDNAME)
    private int prdPrice;       // 가격 (PRDPRICE)
    private String prdMaker;    // 제조회사 (PRDMAKER)
    private String prdColor;    // 색상 (PRDCOLOR)
    private int ctgNo;          // 카테고리 번호 (CTGNO)

  
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
    public String getPrdColor() {
        return prdColor;
    }
    public void setPrdColor(String prdColor) {
        this.prdColor = prdColor;
    }
    public int getCtgNo() {
        return ctgNo;
    }
    public void setCtgNo(int ctgNo) {
        this.ctgNo = ctgNo;
    }
}
