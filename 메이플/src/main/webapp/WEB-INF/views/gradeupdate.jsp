<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  page import="java.sql.*" %>
    <%
    //1. 
    request.setCharacterEncoding("UTF-8");
    
    //2.
    String name = request.getParameter("username");
    String grade = request.getParameter("grade");
    
	//데이터베이스 연결, sql, update 실행 
	Connection con=null;
	PreparedStatement st = null;

	try{ 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기 확인 : testdb, 패스워드
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 //1. 오라클드라이버 로딩
		Class.forName(driver); //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
		
		
		 //4. 필요한 sql 작성
		//String sql ="select * from member_tbl_11"; 
		String sql ="update mp_usertbl ";
			sql += "set grade = ? ";
			sql += "where user_id = ? "; 
		st = con.prepareStatement(sql);
		st.setString(1,grade);
		st.setString(2,name);

		
		//실행
		st.executeUpdate();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( st != null) st.close();
		if( con != null) con.close();
	}
	response.sendRedirect("playerlist2.jsp");
    %>