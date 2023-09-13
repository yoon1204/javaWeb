<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
첫 페이지

<% String id=(String)session.getAttribute("id"); 
	if(id == null){
%>

<a href="/login_09_5/login">로그인</a>

<%}else{%>
<a href="/login_09_5/logOut">로그아웃</a>
<a href="/login_09_5/order">주문하기</a>

<%} %>
</body>
</html> 