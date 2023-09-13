<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
    
    
<%

// jsp 내장객체 
// request, response, out



//0. 넘어온 값들에 대해서 encoding
request.setCharacterEncoding("UTF-8");

//1. 넘어온 값들 꺼내기

String so_id=request.getParameter("so_id");
String so_name=request.getParameter("so_name");
String al_id=request.getParameter("al_id");
String mb_id=request.getParameter("mb_id");
String ly_id=request.getParameter("ly_id");
String sw_id=request.getParameter("sw_id");

System.out.println(so_id);
System.out.println(so_name);
System.out.println(al_id);
System.out.println(mb_id);
System.out.println(ly_id);
System.out.println(sw_id);

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
	String sql = "insert into song_list values(?,?,?,?,?,?)";
	st = con.prepareStatement(sql);	
	
	
	
	st.setString(1, so_id);
	st.setString(2, so_name);
	st.setString(3, al_id);
	st.setString(4, mb_id);
	st.setString(5, ly_id);
	st.setString(6, sw_id);
 
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
	 response.sendRedirect("SHINee노래등록register.jsp");


%>