<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> statement 사용하기</h2>

<%
		
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection con=null; 
		Statement st = null;
		ResultSet rs = null;
		  
		Class.forName(driver);  
		con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
		st = con.createStatement();
		 
		
		String searchid="dy";
		String sql ="select * from  acorntbl  where id='"+  searchid+ "' "; 
		rs = st.executeQuery( sql) ; 
		 
		if( rs.next() ) {
			out.print(rs.getString(1)); // 
			out.print(rs.getString(2));
		}
		
		rs.close();
		st.close();
		con.close(); 

%>

</body>
</html>