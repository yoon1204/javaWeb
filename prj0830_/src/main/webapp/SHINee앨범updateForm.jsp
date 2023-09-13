<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
    
<%
    
   String al_id=request.getParameter("al_id");
   out.println(al_id);
   
   
   String al_name="";
   String al_date="";
  
   
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
		String sql ="select * from album_list where al_id='"+al_id+"'"; 
		 //5. 최종적으로 실행
		rs = st.executeQuery( sql) ; 
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		if( rs.next() ) {
			//out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			//out.print(rs.getString(2));
			//out.print(rs.getString(3)+"<br>");
			al_name=rs.getString(2);
			al_date=rs.getString(3);
			
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

<%=al_id %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="frm" action="SHINee앨범updateForm_action.jsp" method="post">
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
		<td>앨범ID</td>
		<td><input type="text" readonly="readonly" name="al_id"></td>
	</tr>
	
	<tr>
		<td>앨범명</td>
		<td><input type="text" name="al_name"></td>
	</tr>
	
	<tr>
		<td>발매일</td>
		<td><input type="text" name="al_date"></td>
	</tr>
	<tr>
		<td><button type="submit">변경</button></td>
	</tr>
</table>
</form>

<script>

	let frm=document.frm;
	
	frm.al_id.value="<%=al_id%>";
	frm.al_name.value="<%=al_name%>";
	frm.al_date.value="<%=al_date%>";
	

</script>
</body>
</html>
