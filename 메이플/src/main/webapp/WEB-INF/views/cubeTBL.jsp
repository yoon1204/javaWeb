<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/item_list.css" rel="stylesheet" />
<!--ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 아이템 추가 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ -->
<script>
	function check() {
		//return false
		let frm = document.frm;
		let item_code = frm.item_code;
		let item_name = frm.item_name;
		let success = frm.success;
		let price = frm.price;

		if (item_code
				.value == "") {
			alert("코드입력");
			item_code.focus();
			return false;
		}
		if (item_name.value == "") {
			alert("이름입력");
			item_name.focus();
			return false;
		}

		if (item_price.value == "") {
			alert("가격입력");
			price.focus();
			return false;
		}

		return true;
	}
</script>
</head>
<body>
<div class="jy_total">
<h2>Item 조회</h2>
	<div class="item_input">
		<form name="frm" action="iteminsert.jsp" method="post"
			onsubmit="return check()">
			Item_code <input type="text" name="item_code" style="width: 80px">
			이름 <input type="text" name="item_name" style="width: 80px">
			확률 <input type="text" name="success" style="width: 80px"> 가격
			<input type="text" name="price"
				style="width: 80px; margin-right: 10px">
			<button>아이템 추가</button>
			<br></br>
		</form>
	</div>
	<!--ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 아이템 추가 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ -->

	<table>

		<tr class="itemheader">
			<td>Item코드</td>
			<td>이름</td>
			<td>확률</td>
			<td>가격</td>
			<td></td>
		</tr>

		<%
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";

			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기 확인 : testdb, 패스워드
			String url = "jdbc:oracle:thin:@localhost:1521:testdb";
			String user = "scott";
			String password = "tiger";
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			//1. 오라클드라이버 로딩
			Class.forName(driver);
			//2. 데이터베이스 연결
			con = DriverManager.getConnection(url, user, password);

			//3. statement 얻어오기
			st = con.createStatement();

			//4. 필요한 sql 작성
			//String sql ="select * from member_tbl_11"; 
			String sql = "select * from item_cubetbl";
			rs = st.executeQuery(sql);
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><a href="itemupform.jsp?itemid=<%=rs.getString(1)%>">수정</a>/
				<a href="itemdelete.jsp?itemid=<%=rs.getString(1)%>">삭제</a></td>
		</tr>
		<%
		}
		} catch (Exception e) {
		e.printStackTrace();
		} finally { //자원의 반납
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