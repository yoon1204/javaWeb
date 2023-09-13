<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@  include file="header.jsp" %>
<!-- header가 들어 갈 자리 -->


<!-- nav가 들어갈 자리 -->
<%@ include file="nav.jsp" %>
<h2>   include file </h2>

<p>
중복되는 코드를 별도의 파일로 두고 포함시킬 수 있다. 
유지보수성이 좋다 
</p>

<h2>각 header, footer는  각 페이지 마다 공통적이다  include 사용할 수 있다</h2>
<%@  include file="footer.jsp" %>
</body>
</html>