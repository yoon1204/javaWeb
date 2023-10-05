<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 회원정보가 수정 되었습니다.</h2>
	
	<%
	String c = (String) request.getAttribute("id");
	%>

	아이디:<%=c%>
</body>
</html>