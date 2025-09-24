<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<h3>상품 목록</h3>
	<table border="1">
		<tr align="center" bgcolor="lightgreen">
			<th width="10%">상품번호</th>
			<th width="15%">상품명</th>
			<th width="10%">가격</th>
			<th width="15%">제조회사</th>
			<th width="15%">색상</th>
			<th width="10%">카테고리</th>
		</tr>
		<c:forEach var="prd" items="${prdList}">
			<tr>
				<td>${prd.prdNo}</td>
				<td>${prd.prdName}</td>
				<td>${prd.prdPrice}</td>
				<td>${prd.prdMaker}</td>
				<td>${prd.prdColor}</td>
				<td>${prd.ctgNo}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
