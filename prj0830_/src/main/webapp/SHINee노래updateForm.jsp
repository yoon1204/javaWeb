<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
    
<%
    
   String so_id=request.getParameter("so_id");
   out.println(so_id);
   
   
   String so_name="";
   String al_id="";
   String mb_id="";
   String ly_id="";
   String sw_id="";
   
   
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
		String sql ="select * from song_list where so_id='"+so_id+"'"; 
		 //5. 최종적으로 실행
		rs = st.executeQuery( sql) ; 
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		if( rs.next() ) {
			//out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			//out.print(rs.getString(2));
			//out.print(rs.getString(3)+"<br>");
			so_name=rs.getString(2);
			al_id=rs.getString(3);
			mb_id=rs.getString(4);
			ly_id=rs.getString(5);
			sw_id=rs.getString(6);
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

<%=so_id %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="frm" action="SHINee노래updateForm_action.jsp" method="post">
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
	<tr>
		<td>노래ID</td>
		<td><input type="text" readonly="readonly" name="so_id"></td>
	</tr>
	
	<tr>
		<td>노래제목</td>
		<td><input type="text" name="so_name"></td>
	</tr>
	
	<tr>
		<td>앨범ID</td>
		<td><input type="text" name="al_id"></td>
	</tr>
	<tr>
		<td>멤버ID</td>
		<td><input type="text" name="mb_id"></td>
	</tr>
	<tr>
		<td>작사가ID</td>
		<td><input type="text" name="ly_id"></td>
	</tr>
	<tr>
		<td>작곡가ID</td>
		<td><input type="text" name="sw_id"></td>
	</tr>
	<tr>
		<td><button type="submit">변경</button></td>
	</tr>
</table>
</form>

<script>

	let frm=document.frm;
	frm.so_id.value="<%=so_id%>";
	frm.so_name.value="<%=so_name%>";
	frm.al_id.value="<%=al_id%>";
	frm.mb_id.value="<%=mb_id%>";
	frm.ly_id.value="<%=ly_id%>";
	frm.sw_id.value="<%=sw_id%>";

</script>
</body>
</html>
