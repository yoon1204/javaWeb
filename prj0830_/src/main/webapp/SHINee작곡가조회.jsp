<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header>
		<h1>샤이니 앨범 정보</h1>
	</header>
	
	<nav>
		<ul class = "upMenu">
			<li class = "underMenu">앨범
				<ul >
					<li>조회</li>
					<li>등록</li>
				</ul>
			</li>
			<li class = "underMenu">곡
				<ul >
					<li>조회</li>
					<li>등록</li>
				</ul>
			</li>
            <li class = "underMenu">작곡가
				<ul >
					<li>조회</li>
					<li>등록</li>
				</ul>
			</li>
            <li class = "underMenu">작사가
				<ul >
					<li>조회</li>
					<li>등록</li>
				</ul>
			</li>
		</ul>
	</nav>
	
<table>

		<caption>앨범조회</caption>
        <thead>
            <tr>
                <td>작곡가ID</td>
                <td>작곡가이름</td>
                <td>관리</td>
            </tr>
        </thead>


<%
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
		String sql ="select * from songwriter_list"; 
		 //5. 최종적으로 실행
		rs = st.executeQuery( sql) ; 
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
			
		 
		 %>
        <tr>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(2) %></td>
            <td>
            	<a href="SHINee작곡가updateForm.jsp?sw_id=<%=rs.getString(1)%>">수정</a>/
				<a href="SHINee작곡가삭제.jsp?sw_id=<%=rs.getString(1)%>">삭제</a>
			</td>
		</tr>
 <%
	}  
}catch(Exception e){
	e.printStackTrace();
}
finally{ //자원의 반납 
	if( rs!= null) rs.close();
	if( st != null) st.close();
	if( con != null) con.close();
}
 %>
 
    </table>
</body>
</html>