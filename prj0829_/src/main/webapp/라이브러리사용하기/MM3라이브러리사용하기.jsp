<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="day10.classType.LeapYear" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
 String result   = LeapYear.leapYearCheck(2023);
 out.println( result); 
%>

<h3> static 매서드가 아니었다면</h3>

<%
  
LeapYear  c = new LeapYear();
String result2  = c.leapYearCheck(2024); 
out.println( result2);
 
%>

</body>
</html>