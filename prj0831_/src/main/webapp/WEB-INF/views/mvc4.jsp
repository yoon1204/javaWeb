<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>버킷리스트</h2>


<%
String[] list=(String[])request.getAttribute("good");

for(String item : list){
	out.print(item+"<br>");
}
%>
</body>
</html>