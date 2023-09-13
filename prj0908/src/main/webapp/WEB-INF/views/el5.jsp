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

<h2>저장소에서 저장된 값을 꺼내올 때 어떤 순서대로 찾는지 알아두자 !</h2>
pageContext -> request -> session -> application 순으로 찾는다.

<h2>저장소에 담고 꺼내기 예시</h2>
<%

pageContext.setAttribute("test", "test_pageScope");
request.setAttribute("test","test_requestScope");
session.setAttribute("test","test_sessionScope");
application.setAttribute("test","test_applicationScope");

%>

${test}

${requestScope.test}
${sessionScope.test}
${applicationScope.test}
${pageScope.test}

</body>
</html>