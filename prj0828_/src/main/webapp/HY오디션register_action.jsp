<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
<%

// jsp 내장객체 
// request, response, out



//0. 넘어온 값들에 대해서 encoding
request.setCharacterEncoding("UTF-8");

//1. 넘어온 값들 꺼내기

String userid=request.getParameter("userid");
String userpw=request.getParameter("userpw");
String username=request.getParameter("username");
String userbirth=request.getParameter("userbirth");
String usergender=request.getParameter("usergender");
String userspecialty=request.getParameter("userspecialty");
String usercharm=request.getParameter("usercharm");


System.out.println(userid);
System.out.println(userpw);
System.out.println(username);
System.out.println(userbirth);
System.out.println(usergender);
System.out.println(userspecialty);
System.out.println(usercharm);

//2. 데이터베이스에 테이블에 insert

//3. 특정페이지로 재요청할 수 있도록 한다
//   
	 response.sendRedirect("HY오디션관리프로그램2.jsp");


%>