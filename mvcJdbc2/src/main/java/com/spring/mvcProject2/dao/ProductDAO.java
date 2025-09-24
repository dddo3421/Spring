package com.spring.mvcProject2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvcProject2.dto.ProductDTO;


@Repository
public class ProductDAO {
private DataSource dataFactory;	
	
	@Autowired
	public ProductDAO(DataSource dataSource) { // bean으로 등록한 dataSource 자동 주입 
		try {
			this.dataFactory = dataSource;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원 정보 조회 메소드 (전체 회원 정보 SELECT 해서 반환)
		// MemberVO로 받아서 ArrayList에 저장 후 ArrayList 객체 memList 반환
		public ArrayList<ProductDTO> productSelect() {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			// 데이터 저장해서 반환할 ArrayList 객체 생성
			ArrayList<ProductDTO> prdList = new ArrayList<ProductDTO>();
			
			
			try {
				System.out.println("chekc");
				// connection pool에서 con 객체 빌려옴
				con = dataFactory.getConnection();
				
				String sql = "select * from product";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
				    // 한 행(1개 상품) 처리
					String prdNo    = rs.getString("PRDNO");
					String prdName  = rs.getString("PRDNAME");
					int prdPrice    = rs.getInt("PRDPRICE");
					String prdMaker = rs.getString("PRDMAKER");
					String prdColor = rs.getString("PRDCOLOR");
					int ctgNo       = rs.getInt("CTGNO");

					// ProductDTO에 담아서
					ProductDTO vo = new ProductDTO();
					vo.setPrdNo(prdNo);
					vo.setPrdName(prdName);
					vo.setPrdPrice(prdPrice);
					vo.setPrdMaker(prdMaker);
					vo.setPrdColor(prdColor);
					vo.setCtgNo(ctgNo);

					// ArrayList에 추가
					prdList.add(vo);
				}			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					System.out.println("con"+con);
					rs.close();
					pstmt.close();
					con.close();
				} catch (SQLException e) {}
			}
			
			return prdList; // ArrayList 반환
		}
}
