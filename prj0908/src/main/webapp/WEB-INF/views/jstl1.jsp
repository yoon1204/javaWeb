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


	<%
	String[] result=(String[])request.getAttribute("books");
	%>
	
	<table>
		<tr>
			<td>책제목</td>
		</tr>
		<% for(String book : result) {%>
		<tr>
			<td><%=book%></td>
		</tr>
		<%} %>	
	</table>
	
	<h2>EL과 jstl</h2>
	
	<table>
		<tr>
			<td>책제목</td>
		</tr>
		
		<c:forEach var="item" items="${books}">
			<tr>
				<td>${item}</td>
			</tr>
		</c:forEach>
	</table>
		
		
</body>
</html>