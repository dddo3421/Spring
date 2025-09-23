<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	상품번호 : ${productInfo.prdNo}<br>
	상품명   : ${productInfo.prdName}<br>
	가격     : ${productInfo.prdPrice}<br>
	제조회사 : ${productInfo.prdMaker}<br>
	제조일   : ${productInfo.prdDate}<br>
	재고     : ${productInfo.prdStock}<br>
	<a href="<c:url value='/'/>">index</a>
</body>
</html>