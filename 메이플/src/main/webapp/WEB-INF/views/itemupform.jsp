<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	//statement 방식
	String itemid = request.getParameter("itemid");
	
	//*** 
	String itemname = "";
	String success = "";
	String price = "";
	
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기 확인 : testdb, 패스워드
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		//2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); 
		//3. statement 얻어오기
		st = con.createStatement();
		
		 //4. 필요한 sql 작성
		String sql ="select * from item_cubetbl where item_code = '" + itemid + "'"; 
		
		 //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		if( rs.next() ) {
			//out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			//out.print(rs.getString(2));
			//out.print(rs.getString(3) + "<br>");
			itemname = rs.getString(2);
			success = rs.getString(3);
			price = rs.getString(4);
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
	<link href="./css/update.css" rel="stylesheet" />
	<%@  page import="java.sql.*" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="jy_total">
 <h2> Item 수정 </h2>
	<div class = "updatemain">
	<form name = "frm" action="itemupdate.jsp" method="post">
	<table>
		<tr class = "itemheader">
			<td>이름</td>
			<td><input type="text" readonly = "readonly"  name ="item_name" ></td>
		</tr>
		<tr class = "itemheader">
			<td>확률</td>
			<td><input type="text"  name ="item_success" ></td>
		</tr>
		<tr class = "itemheader">
			<td>가격</td>
			<td><input type="text"  name ="item_price" ></td>
		</tr>
		<tr >
			<td class = "upbutton"><input type="submit" value = "변경"></td>
			<td><button><a link ="cubeTBL.jsp">홈으로</a></button></td>
		</tr>
	</table>
	</form>
	</div>
	<script>
	let frm = document.frm;
	frm.item_name.value = "<%=itemname%>";
	frm.item_success.value = "<%=success%>";
	frm.item_price.value = "<%=price%>";
	</script>
	<div class="backimage"></div>
	</div>
</body>
</html>