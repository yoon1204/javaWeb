<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="prj0901.Customer"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>삭제하기</h2>
	<%
	String c = (String) request.getAttribute("id");
	%>

	아이디:<%=c%>

</body>
</html>