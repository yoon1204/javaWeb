<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

    <%
    
    
    //1.
    request.setCharacterEncoding("UTF-8");
    
    //2.
    String al_id=request.getParameter("al_id");
    String al_name=request.getParameter("al_name");
    String al_date=request.getParameter("al_date");
   
    
    
   out.println(al_id);
   out.println(al_name);
   out.println(al_date);
   
   
   
   //데이터베이스 연결, sql, update 실행
    Connection con = null;
	PreparedStatement st = null;

	try {
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost : 데이터베이스가 있는 위치(다른 컴퓨터면 그 컴퓨터의 IP)
		String user = "scott"; // DB Id
		String password = "tiger"; // DB PW

		//1. 오라클드라이버 로딩
		Class.forName(driver);
		//2. 데이터베이스 연결
		con = DriverManager.getConnection(url, user, password);
		//3. 필요한 sql 작성
		String sql = "update album_list set al_name= ? , al_date= ? where al_id= ? ";
		st = con.prepareStatement(sql);
		
		st.setString(1,al_name);
		st.setString(2,al_date);
		st.setString(3,al_id);
		
		
		//4. 최종적으로 실행
		st.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally { //자원의 반납 
		if (st != null)
			st.close();
		if (con != null)
			con.close();
	}
   
   
   
   
   //
   //response.sendRedirect("index.jsp");
        
   %>