<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

    <%
    
    
    //1.
    request.setCharacterEncoding("UTF-8");
    
    //2.
    String so_id=request.getParameter("so_id");
    String so_name=request.getParameter("so_name");
    String al_id=request.getParameter("al_id");
    String mb_id=request.getParameter("mb_id");
    String ly_id=request.getParameter("ly_id");
    String sw_id=request.getParameter("sw_id");
    
    
    
   out.println(so_id);
   out.println(so_name);
   out.println(al_id);
   out.println(mb_id);
   out.println(ly_id);
   out.println(sw_id);
   
   
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
		String sql = "update song_list set so_name= ? , al_id= ? , mb_id= ? , ly_id= ? , sw_id= ? where so_id= ? ";
		st = con.prepareStatement(sql);
		
		st.setString(1,so_name);
		st.setString(2,al_id);
		st.setString(3,mb_id);
		st.setString(4,ly_id);
		st.setString(5,sw_id);
		st.setString(6,so_id);
		
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