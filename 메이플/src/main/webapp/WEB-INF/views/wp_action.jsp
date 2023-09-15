<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
//jsp 내장객체 (서블릿은 지정해줘야됨)
//request, response, out

//0. 넘어온 값들에 대해서 encoding
request.setCharacterEncoding("UTF-8");

//1. 넘어온 값을 꺼내기
String wpid = request.getParameter("wpid");
String wpname = request.getParameter("wpname");
String wpprice = request.getParameter("wpprice");

System.out.println(wpid);
System.out.println(wpname);
System.out.println(wpprice);

//2. 데이터베이스의 테이블에 insert
Connection con = null;
PreparedStatement st = null;

try {
	//데이터베이스 연결정보 
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	//1. 오라클드라이버 로딩
	Class.forName(driver);
	//2. 데이터베이스 연결
	con = DriverManager.getConnection(url, user, password);
	//3. statement 얻어오기
	String sql = "insert into mp_wp values(?,?,?)";
	st = con.prepareStatement(sql);

	st.setString(1, wpid);
	st.setString(2, wpname);
	st.setString(3, wpprice);
	
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
