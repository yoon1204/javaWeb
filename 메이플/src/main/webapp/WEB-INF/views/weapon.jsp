<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<link href="./css/item_list.css" rel="stylesheet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function check() {
		//return false;
		let frm = document.frm;
		let wpid = frm.wpid;
		let wpname = frm.wpname;
		let wpprice = frm.wpprice;

		if (userid.value == "") {
			alert("무기코드 입력");
			userid.focus();
			return false;
		}
		if (userpw.value == "") {
			alert("무기명 입력");
			userpw.focus();
			return false;
		}
		if (username.value == "") {
			alert("무기가격 입력");
			username.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<div class="jy_total">
	<h2>WEAPON 조회</h2>
	<div class="item_input">

		<form name="frm" action="wp_action.jsp" method="post"
			onsubmit="return check()">
			Weapon_code <input type="text" name="wpid" style="width: 80px">
			이름 <input type="text" name="wpname" style="width: 80px"> 가격 <input
				type="text" name="wpprice" style="width: 80px">
			<button>무기 추가</button>
		</form>
	</div>

	<table>
		<tr class="itemheader">
			<td>WEAPON코드</td>
			<td>WEAPON명</td>
			<td>WEAPON가격</td>
			<td></td>
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
			String sql = "select * from mp_wp";

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
			<td><a href="wp_updateForm.jsp?wpid=<%=rs.getString(1)%>">수정</a>/
				<a href="wp_delete_action.jsp?wpid=<%=rs.getString(1)%>">삭제</a></td>
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
	<form name="frm" action="상품관리.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">홈으로</button>
				</form>
	<div class="backimage"></div>
</div>

</body>
</html>