<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
	int su  =  Integer.parseInt( request.getParameter("su") );		
	int su_half = su/2;		
	System.out.println( su);
	System.out.println( su_half);		
	ArrayList<Integer> nums = new ArrayList<>();
		
	for( int i=1 ; i<=su_half ; i++) {
		if( su % i  ==0) {
			 nums.add(i);
			}
	}		
	nums.add(su);		 
	String divisors = nums.toString();
	System.out.println( divisors);		
	out.println( divisors);
		
%>
</body>
</html>