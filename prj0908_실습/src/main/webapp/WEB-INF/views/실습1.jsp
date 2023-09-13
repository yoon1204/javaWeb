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

	<h2>1부터 10까지 출력하기</h2>
	
	<h4>자바</h4>
		<%
		for(int i=1; i<=10; i++){
			out.println(i);	
		}
		%>
	<h4>el,jstl</h4>
	<c:forEach var="i" begin="1" end="10">
		${i}
	</c:forEach>
		
	
		
	
	
</body>
</html>