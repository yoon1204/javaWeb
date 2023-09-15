<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문서 조회</title>
<link href="./css/item_list.css" rel="stylesheet" />
</head>
<body>
<div class="jy_total">
	<h2>주문서 조회</h2>

	<table>
		<tr class = "itemheader">
			<td>주문서번호</td>
			<td>유저아이디</td>
			<td>등급</td>
			<td>상품명</td>
			<td>주문수량</td>
			<td>개당가격</td>
			<td>총가격</td>
			<td>할인가</td>
		</tr>

		<%
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String user = "scott";
			String password = "tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();

			String sql = "SELECT s.order_id 주문번호, u.user_id 유저아이디, v.grade_name 등급, ";
			sql += "MAX(CASE ";
			sql += "    WHEN c.item_code IS NOT NULL THEN c.item_name ";
			sql += "    WHEN w.wp_code IS NOT NULL THEN w.wp_cat ";
			sql += "    ELSE '' ";
			sql += "END) AS 상품명, ";
			sql += "s.cnt 주문수량, ";
			sql += "SUM(CASE ";
			sql += "    WHEN c.item_code IS NOT NULL THEN c.item_price ";
			sql += "    WHEN w.wp_code IS NOT NULL THEN w.wp_price ";
			sql += "    ELSE 0 ";
			sql += "END) AS 개당가격, ";
			sql += "SUM(CASE ";
			sql += "    WHEN c.item_code IS NOT NULL THEN c.item_price * s.cnt ";
			sql += "    WHEN w.wp_code IS NOT NULL THEN w.wp_price * s.cnt ";
			sql += "    ELSE 0 ";
			sql += "END) AS 총가격, ";
			sql += "SUM(CASE ";
			sql += "    WHEN c.item_code IS NOT NULL THEN c.item_price * s.cnt * (1 - v.grade_dr/100) ";
			sql += "    WHEN w.wp_code IS NOT NULL THEN w.wp_price * s.cnt * (1 - v.grade_dr/100) ";
			sql += "    ELSE 0 ";
			sql += "END) AS 할인가 ";
			sql += "FROM mp_store s ";
			sql += "JOIN mp_usertbl u ON s.user_id = u.user_id ";
			sql += "LEFT JOIN item_cubetbl c ON s.item_code = c.item_code ";
			sql += "LEFT JOIN mp_wp w ON s.wp_code = w.wp_code ";
			sql += "JOIN mp_vip v ON u.grade = v.grade_code ";
			sql += "GROUP BY s.order_id, u.user_id, v.grade_name, s.cnt";

			rs = st.executeQuery(sql);

			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><%=rs.getString(7)%></td>
			<td><%=rs.getString(8)%></td>
		</tr>
		<%
		}
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
		if (rs != null)
		rs.close();
		if (st != null)
		st.close();
		if (con != null)
		con.close();
		}
		%>
	</table>
		<form name="frm" action="상품관리.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">홈으로</button>
				</form>
	<div class="backimage"></div>
	</div>
</body>
</html>