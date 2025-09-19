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
	<h3>index 페이지입니다<br></h3>
	
	<a href="/project/showInfo">showInfo</a><br>
	<a href="/project/showInfo2">showInfoMV</a><br>
	<a href="/project/showInfo3">showInfoMV+MODEL</a><br>
	<a href="/project/book/bookInfoView1">bookInfoView1</a><br>
	<a href="/project/book/bookInfoView2">bookInfoView2</a><br>
	<hr>
	<h3>학생정보<br></h3>
	<a href="/project/student/studentForm">학생정보입력(정적경로)</a><br>
	<a href="<c:url value='/student/studentForm2'/>">학생정보입력2(동적경로)</a><br>
	<hr>
	<h3>상품등록<br></h3>
	<a href="/project/product/productForm">새상품입력(Request 객체 사용)</a><br>
	<a href="<c:url value='/product/productForm2'/>">새상품2(RequestParam 이용)</a><br>
</body>
</html>