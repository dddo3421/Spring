<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getParameter 사용</title>
</head>
<body>
	학번 : ${no }<br>
	성명	: ${name }<br>
	학년 : ${year }<br>
	<a href="<c:url value='/'/>">index</a>
	
	<br>
	url을 통한 데이터 전달<br>
	학번은 서버에게 전달해서 해당 학번 학생의 정보를 확인<br>
	http://localhost:8080/project/student/studentDetailView/001<br>
	학번 : <a href="/project/student/studentDetailView/${no}">${no}</a>
	<br>
	url을 통한 동적 데이터 여러 개 전달<br>
	학번 : <a href="/project/student/studentDetailView/${no}/${name}/${year}">${no}</a>
	<br>
	url을 통한 정적 데이터 여러 개 전달<br>
	학번 : <a href="/project/student/studentDetailView/1/홍길동/5">정적데이터url로 전달</a>
	
</body>
</html>