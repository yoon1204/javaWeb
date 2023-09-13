<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
    
<%
    
   String userid=request.getParameter("userid");
   out.println(userid);
   
   
   String userpw="";
   String username="";
   
   
   Connection con=null; 
   Statement st = null;
   ResultSet rs = null;
   try{ 
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
	
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); 
		 //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql ="select * from acorntbl where id='"+userid+"'"; 
		 //5. 최종적으로 실행
		rs = st.executeQuery( sql) ; 
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		if( rs.next() ) {
			//out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			//out.print(rs.getString(2));
			//out.print(rs.getString(3)+"<br>");
			userpw=rs.getString(2);
			username=rs.getString(3);
		}  
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납 
		if(rs!= null) rs.close();
		if(st != null) st.close();
		if(con != null) con.close();
	}
%>

<%=userid %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="frm" action="update_action.jsp" method="post">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" readonly="readonly" name="userid"></td>
	</tr>
	
	<tr>
		<td>비번</td>
		<td><input type="text" name="userpw"></td>
	</tr>
	
	<tr>
		<td>이름</td>
		<td><input type="text" name="username"></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="변경"></td>
	</tr>
</table>
</form>

<script>
	let frm=document.frm;
	frm.userid.value="<%=userid%>";
	frm.userpw.value="<%=userpw%>";
	frm.username.value="<%=username%>";

</script>
</body>
</html>
