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

	<h2>성적에 따라 A, B, C ,F( 70미만) 출력하기</h2>
	<h2>kor변수에 점수값을 임의로 정하고 구하기</h2>
	
	<h4>자바</h4>
		
	 <% 
	 	
	 	int kor = 90;
	 
	 	if(kor>=90)
		 {out.println("점수출력");}	
		
		if(kor>=90){
			out.println("A");
		}else if(kor>=80){
			out.println("B");
		}else if(kor>=70){
			out.println("C");
		}else{
			out.println("F");
		}
		%>


	<h4>el,jstl</h4>
		<c:set var="kor" value="90"/>
		
		<c:if test="${kor>=90}">장학금대상</c:if>	
		
		<h2> 성적출력</h2>
		<c:choose>
		<c:when test="${kor>=90}">A</c:when>
		<c:when test="${kor>=80}">B</c:when>
		<c:when test="${kor>=70}">C</c:when>
		<c:otherwise>F</c:otherwise>
		</c:choose>


</body>
</html>