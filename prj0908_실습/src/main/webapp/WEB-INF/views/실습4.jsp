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

 <h2>책이름배열 출력하기</h2>
 
 
 <c:forEach var="i" items="${bookNames }">
             ${i}
</c:forEach>

</body>
</html>