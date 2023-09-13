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

<h2> PrepareStatement </h2>

<p>
sql을 먼저 작성한다 값이 들어갈 자리는 ?를 사용한다
쿼리실행하기전에 ?에 값을 세팅한다.
</p>

<%
		
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection con=null; 
		PreparedStatement st = null;
		ResultSet rs = null;
		  
		Class.forName(driver);  
		con= DriverManager.getConnection(url, user, password);  
		 
		
		String searchid="dy";
		String sql ="select * from  acorntbl  where id= ? "; 
		st = con.prepareStatement(sql);
		
		st.setString(1,searchid);
		rs = st.executeQuery( ) ; 
		 
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