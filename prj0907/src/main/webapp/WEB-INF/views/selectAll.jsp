<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "prj0907.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% ArrayList<Student> std_list = (ArrayList<Student>)request.getAttribute("Key_list"); %>
	<h2> 에이콘 학생 목록 </h2>
	
	<table>
		<tr>
			<td>순번</td>
			<td>아이디</td>
			<td>이름</td>
			<td>비번</td>
		</tr>
		<%
		for(int i=0; i<std_list.size(); i++){
		%>	
		
		<tr>
			<td><%= i+1 %></td>
			<td><%= std_list.get(i).getId() %></td>
			<td><%= std_list.get(i).getName() %></td>
			<td><%= std_list.get(i).getPw() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>