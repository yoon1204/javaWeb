<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문서 조회</title>

<link href="./css/item_list.css" rel="stylesheet" />
<script>
function check( index){
	let frm = document.frm;
	
	let grade = frm[index].grade.value;
		if( grade==""){
			alert(" 종류를 선택하세요");
			return false;
		}else{
			return true;
		}
	}
</script>

</head>

<body>
	<h2>등급 관리</h2>

	<table>
		<tr class = "itemheader">
			<td>닉네임</td>
			<td>서버</td>
			<td>등급</td>
			<td>등급변경</td>
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
			
			String sql = "SELECT u.USER_ID AS 닉네임, s.SV_NAME AS 서버, v.GRADE_NAME AS 등급 "
	                   + "FROM mp_usertbl u "
	                   + "left JOIN mp_vip v ON u.grade = v.GRADE_CODE "
	                   + "JOIN mp_server s ON u.SV_CODE = s.SV_CODE";
		
			rs = st.executeQuery(sql);

			int i=0;
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><form name="frm" action="gradeupdate.jsp?username=<%=rs.getString(1)%>"  method="post"   onsubmit="return check( <%=i%>)">
				<select name="grade">
						<option value="">선택하시오</option>
						<option value="V001">레드</option>
						<option value="V002">골드</option>
						<option value="V003">실버</option>
						<option value="V004">브론즈</option>
					</select>
					<button type="submit">변경</button>
				</form></td>
		</tr>
		<%
		
		i++;
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
		<div class = "backimage">
	</div>
</body>

</html>