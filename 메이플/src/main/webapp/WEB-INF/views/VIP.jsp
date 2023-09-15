<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/item_list.css" rel="stylesheet" />
</head>
<body>
<div class="jy_total">
	<h2>VIP 조회</h2>

	<table>
		<tr class = "itemheader">
			<td>VIP코드</td>
			<td>등급</td>
			<td>할인율</td>
		</tr>
		<%
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
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
			st = con.createStatement();
			//4. 필요한 sql 작성
			String sql = "select * from mp_vip";	

			System.out.println(sql);
			rs = st.executeQuery(sql);
			//6. 가져온 쿼리 결과를 화면에 출력하기
			while (rs.next()) {
		%>
		<!--  db 연동이후 데이터 조회부분 -->
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
		</tr>
		<%
		}
		} catch (Exception e) {
		e.printStackTrace();
		} finally { //자원의 반납 
		if (rs != null)
		rs.close();
		if (st != null)
		st.close();
		if (con != null)
		con.close();
		}
		%>
	</table>
			<form name="frm" action="유저조회.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">홈으로</button>
				</form>
<div class="backimage"></div>

</div>

</body>
</html>