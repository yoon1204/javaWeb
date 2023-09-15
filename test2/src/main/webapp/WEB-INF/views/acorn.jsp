<%@page import="test.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>에이콘 학생리스트</h2>
<% ArrayList<Customer> list=(ArrayList<Customer>)request.getAttribute("list"); %>

<table>
<tr>
<td>아이디</td>
<td>비밀번호</td>
<td>이름</td>
</tr>

<% for(Customer c: list){%>

	<tr>
		<td><%=c.getId() %></td>
		<td><%=c.getPw()%></td>
		<td><%=c.getName() %></td>
	</tr>


<% }%>	



</table>
</body>
</html>