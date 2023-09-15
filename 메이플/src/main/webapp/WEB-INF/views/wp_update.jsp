<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
//1.
request.setCharacterEncoding("UTF-8");

//2.
String wpid = request.getParameter("wpid");
String wpprice = request.getParameter("wpprice");
String wpname = request.getParameter("wpname");


out.println(wpid);
out.println(wpname);
out.println(wpprice);

//데이터베이스 연결, sql, update 실행

Connection con = null;
PreparedStatement st = null;
try {
	//데이터베이스 연결정보 
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	Class.forName(driver);

	con = DriverManager.getConnection(url, user, password);

	String sql = "update mp_wp ";
	sql += " set wp_price= ? ";
	sql += " where wp_cat= ? ";

	st = con.prepareStatement(sql);

	st.setString(1, wpprice);
	st.setString(2, wpname);
	
	//실행
	st.executeUpdate();

} catch (Exception e) {
	e.printStackTrace();
} finally { //자원의 반납 

	if (st != null)
		st.close();
	if (con != null)
		con.close();
}
response.sendRedirect("weapon.jsp");

%>