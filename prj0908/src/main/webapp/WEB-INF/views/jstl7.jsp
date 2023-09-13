<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
// 현재날짜가져오기
Date date = new Date();
%>

<fmt:formatDate value="<%=date %>" /> 

<h2>el 표현으로 date 정보를 출력하고 싶다면..  c:set 으로 저장소에 저장을 해야 한다 . !!!!!</h2>
<c:set var="now"  value="<%=date%>" /> 
<fmt:formatDate value="${now}" />
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss" />
  
</body>
</html>