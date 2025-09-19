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
</body>
</html>