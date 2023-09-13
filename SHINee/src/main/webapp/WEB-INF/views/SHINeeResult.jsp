<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String album=(String)request.getAttribute("album");
	String version=(String)request.getAttribute("version");%>
<h2>앨범 구매 페이지 </h2>
<h3>구매할 앨범은 무엇입니까?</h3>
구매할 앨범의 갯수는?<%=album %> <br>
구매할 앨범의 버전은?<%=version %> <br>
<button>구매</button>
</body>
</html>