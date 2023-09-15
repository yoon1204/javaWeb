<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<%
//물음표 방식
//jsp 내장객체
//reuest, reponse, out

//0. 넘어온 값들에 대해서 인코딩(한글깨짐 해결)
request.setCharacterEncoding("UTF-8");
//1. 넘어온 값을 꺼내기(요청)
String item_code = request.getParameter("item_code");
String item_name = request.getParameter("item_name");
String up_percent = request.getParameter("success");
String item_price = request.getParameter("price");

System.out.println(item_code);
System.out.println(item_name);
System.out.println(up_percent);
System.out.println(item_price);

//2. 데이터베이스 테이블에 insert 
	Connection con=null;
	PreparedStatement st = null;

	try{ 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기 확인 : testdb, 패스워드
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		 //오라클드라이버 로딩
		Class.forName(driver); //데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); 
		//statement 얻어오기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ prepare로 바뀜 물음표로 두고 물음표자리에 값을 세팅
	    //insert 진행
		String sql = "insert into item_cubetbl values(?,?,?,?)";
		st = con.prepareStatement(sql);
		
		st.setString(1,item_code);
		st.setString(2,item_name);
		st.setString(3,up_percent);
		st.setString(4,item_price);
		
		st.executeUpdate();

	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( st != null) st.close();
		if( con != null) con.close();
	}
//3. 특정페이지로 재요청 할 수 있도록 한다.
response.sendRedirect("cubeTBL.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>