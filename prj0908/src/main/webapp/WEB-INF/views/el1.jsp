<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% String result = (String) request.getAttribute("data"); %>
<%=result %>


<h2>EL 사용 : 저장소에 있는 값들을 쉽게 꺼내올 수 있다.</h2>
${data}
<h2>사칙연산</h2>
${10+20}
${10/3}
${10%3}
<h2>논리연산</h2>
${true && true}
${true && false}
${true and false}
${true || false}
${true or false}
${not true}

<h2>empty</h2>

empty연산자 null이면 true

<%
	pageContext.setAttribute("title","EL연산자");
%>

${empty title}
${not empty title}





</body>
</html>