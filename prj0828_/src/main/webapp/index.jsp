<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/index.css" rel="stylesheet" />

</head>
<body>
<header>
	택시예약프로그램
</header>

<nav>

<ul>
<li>택시예약</li>
<li>택시수정</li>
<li>택시현황</li>
<li>홈으로</li>
</ul>
</nav>

<section>
<h2>택시예약 프로그램을 작성할 수 있다.</h2>
<ol>
<li>택시예약 테이블을 작성할 수 있다</li>
<li>택시예약을 할 수 있도록 구현할 수 있다</li>
<li>주어진 화면디자인을 이용하여 화면을 디자인 할 수 있다</li>
<li>업무요건에 따라 프로그램을 작성할 수 있다</li>
</ol>
</section>

	<table border="1">
		<caption>택시 예약 등록</caption>
			<tr>
				<td>예약번호</td>
				<td><input type="text"></td>
			</tr>	
			
			<tr>
				<td>예약시간</td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td>예약날짜</td>
				<td><input type="text"></td>
			<tr>
			
			<tr>
				<td>고객아이디</td>
				<td><input type="text"></td>
			</tr>	
				
			<tr>	
				<td>출발지</td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td>목적지</td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td>택시번호</td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td>배차상태</td>
				<td>
					<select>
						<option>선택하기</option>
						<option>배차완료</option>
						<option>배차준비</option>
						<option>배차미정</option>	
		    		</select>   
				</td>
			</tr>
			<tr>
			<td colspan="2">
				<button>등록</button>
				<button>다시입력</button>		
			</td>	
				
			</tr>
			
			
	</table>
		
<footer>
HRD korea
</footer>





</body>
</html>