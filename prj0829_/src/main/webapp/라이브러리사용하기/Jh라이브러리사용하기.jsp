<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page import="day10.라리브러리연습" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

    라리브러리연습 c= new 라리브러리연습();
	c.input(5, 3, '-');
	c.print();
	
	
	// 객체 생성시  Class.forName을 통해서 객체의 정보를 얻어온 다음  newInstance() 매서드를 통해서 객체를 생성할 수 있다
	Class clazz =Class.forName("day10.라리브러리연습");
	라리브러리연습 c2 = (라리브러리연습)clazz.newInstance();
	c2.input(1, 2, '+');
	c2.print();
	
%>
</body>
</html>