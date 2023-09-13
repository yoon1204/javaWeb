<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*" %>
<%@ page import="prj0901.Megacoffee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	Megacoffee m = (Megacoffee) request.getAttribute("megacoffee");
	%>

	<h2>상품정보 조회</h2>
	 
	 
	 <%
	 	

	 		out.println(m.getId());
	 		out.println(m.getName());
	 		out.println(m.getPrice() +"<br>");
	 	
	 
	 %>
</body>
</html>