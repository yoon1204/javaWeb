<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import ="java.util.ArrayList" %>
<%@ page import ="acorn.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>에이콘 학생리스트</h2>


<% ArrayList<Customer> list  =(ArrayList<Customer>) request.getAttribute("list"); %>


<% for( int i=0; i< list.size() ;i++){	
	out.println( list.get(i).getId()  );
	out.println( list.get(i).getPw() );
	out.println( list.get(i).getName() +"<br>");
}%>
 

</body>
</html>