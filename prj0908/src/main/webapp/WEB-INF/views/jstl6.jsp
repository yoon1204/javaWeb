<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<fmt:formatNumber value="1234567" pattern="#,###" />
<fmt:formatNumber value="1234.5678" pattern="#,##0.00" />
<fmt:formatNumber value="0.75" type="percent" />
<fmt:formatNumber value="1000" type="currency" currencyCode="USD" />
<fmt:formatNumber value="1000" type="currency" currencyCode="KRW" />
 
 
 <h2>  JSTL fmt 이용하여 포멧팅 하기</h2>
<%
  int number1= 1234567;
  double number2 = 1234.5678;
%>
 
<fmt:formatNumber value="<%=number1%>" pattern="#,###" />
<fmt:formatNumber value="<%=number2 %>" pattern="#,##0.00" />
 


</body>
</html>