<%@page import="Acorn.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 table{
 width:600px;
  border:1px solid black;
  border-collapse: collapse;
  margin:0 auto;
 }
 
 td{
   border:1px solid black;
 }
</style>
</head>
<body>

<% ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list"); %>


<table>

<tr>
<td>아이디</td>
<td>비번</td>
<td>이름</td>
</tr>


<% for (Member m : list) {  %>
<tr>
<td> <%=m.getId() %></td>
<td> <%=m.getPw() %></td>
<td> <%=m.getId() %></td>
</tr>
<% 
}%>

</table>
	 

</body>
</html>