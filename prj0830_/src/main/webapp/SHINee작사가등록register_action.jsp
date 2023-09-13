<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
    
    
<%

// jsp 내장객체 
// request, response, out



//0. 넘어온 값들에 대해서 encoding
request.setCharacterEncoding("UTF-8");

//1. 넘어온 값들 꺼내기

String ly_id=request.getParameter("ly_id");
String ly_name=request.getParameter("ly_name");


System.out.println(ly_id);
System.out.println(ly_name);


Connection con=null;
PreparedStatement st=null;


try{ 
	// 데이터베이스 연결정보
	String driver="oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";

	 //1. 오라클드라이버 로딩
	Class.forName(driver); 
	 //2. 데이터베이스 연결
	con= DriverManager.getConnection(url, user, password); 
	 //3. statement 얻어오기
	String sql = "insert into song_list values(?,?)";
	st = con.prepareStatement(sql);	
	
	
	
	st.setString(1, ly_id);
	st.setString(2, ly_name);
	
	st.executeUpdate();
	
	
}catch(Exception e){
	e.printStackTrace();
}
finally{ //자원의 반납 
	if(st !=null) st.close();
	if(con !=null) con.close();
}
//3. 특정페이지로 재요청할 수 있도록 한다
//   
	 response.sendRedirect("SHINee작사가등록register.jsp");


%>