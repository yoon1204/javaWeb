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

	<h4> 자바 </h4>
	<%String hi5="안녕하세요";
	  for(int i=0; i<5; i++){
		  out.println(hi5);
	  } 	  
	  pageContext.setAttribute("hi6", hi5);
	  
	%>
	
	<h2>hi5 출력여부</h2>
	${hi5}
	
		
	<h2>hi6 출력여부</h2>
	${hi6}
	
	
	<h4>el,jstl</h4>
	<c:set var="hi" value="안녕하세요"/>
	<c:forEach var="i" begin="1" end="5">	
		${hi}
	</c:forEach>	
	
	<%	
	String hi2="안녕";
	 for( int i=1; i<=5; i++){
		 out.println(hi2);
	 }	
	%>
	
</body>
</html>