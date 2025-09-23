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
	
	<h3>도서정보<br></h3>
	<a href="/project/bookInfoView1">bookInfoView1</a><br>
	<a href="/project/bookInfoView2">bookInfoView2</a><br>
	<a href="/project/bookInfoView3">bookInfoView3</a><br>
	<a href="<c:url value='/bookInfoView4'/>">bookInfoView4</a><br>
	
	<hr>
	<h3>학생정보<br></h3>
	<a href="/project/student/studentForm">학생정보입력(정적경로)</a><br>
	<a href="<c:url value='/student/studentForm2'/>">학생정보입력2(동적경로)</a><br>
	<a href="<c:url value='/student/studentForm3'/>">학생정보입력3(command 객체 사용)</a><br>
	<a href="<c:url value='/student/studentForm4'/>">학생정보입력4(command 객체 사용 + @ModelAttribute 사용)</a><br>
	<a href="<c:url value='/student/studentForm5'/>">학생정보입력5(Date 타입의 정보 전달)</a><br>
	<a href="<c:url value='/student/studentSearchForm'/>">학생정보검색(여러 정보 HashMap에 저장)</a><br>
	
	<hr>
	<h3>상품등록<br></h3>
	<a href="/project/product/productForm">새상품입력(Request 객체 사용)</a><br>
	<a href="<c:url value='/product/productForm2'/>">새상품2(RequestParam 이용)</a><br>
	<a href="<c:url value='/product/productForm3'/>">새상품3(command 객체 이용)</a><br>
	<a href="<c:url value='/product/productForm4'/>">새상품4(command 객체 이용 + @ModelAttribute 사용)</a><br>
	<a href="<c:url value='/product/productSearchForm'/>">상품정보검색(여러 정보 HashMap에 저장)</a><br>
	
	<hr>
	<h3>redirect<br></h3>
	<a href="<c:url value='/redirect'/>">redirect</a><br>
	<a href="<c:url value='/redirectParam1'/>">redirect-쿼리스트링</a><br>
	<a href="<c:url value='/redirectParam2'/>">redirect-모델객체에 추가</a><br>
	<a href="<c:url value='/redirectParam3'/>">redirect-리다이렉트속성 객체에 추가</a><br>
</body>
</html>