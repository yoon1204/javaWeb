<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/HY오디션관리프로그램.css" rel="stylesheet" />

</head>

<script>
function check(){
	//return false;
	
	let frm=document.frm;
	let userid=frm.userid;
	let userpw=frm.userpw;
	
	if(userid.value==""){
		alert("아이디입력");
		userid.focus();
		return false;
	}
	if(userpw.value==""){
		alert("비번입력");
		userpw.focus();
		return false;
	}
	return true;
}
</script>

<body>
<header>
	HY라우드 오디션 ver 1.0
</header>

<nav>

<ul>
<li>참가자등록</li>
<li>참가자목록 조회</li>
<li>참가자점수 조회</li>
<li>참가자등수 조회</li>
<li>홈으로</li>
</ul>
</nav>

<section>
<h2>오디션관리 프로그램</h2>
<h4>오디션 위한 프로그램이다</h4>
<ol >
<li>내용작성</li>
<li>내용작성</li>
<li>내용작성</li>
</ol>
</section>

<table>
		<caption>참가자 등록</caption>
			<tr>
				<td>참가자ID</td>
				<td><input type="text"></td>
			</tr>	
			
			<tr>
				<td>참가자이름</td>
				<td><input type="text"></td>
			</tr>
			
			<tr>
				<td>생년월일</td>
				<td>
					<input type="text">년
					<input type="text">월
					<input type="text">일
				</td>
			</tr>
			
			<tr>
				<td>성별</td>			 
    			<td><input type="radio" name="gender">남
					<input type="radio" name="gender">여	
				</td>		
			</tr>	
				
			<tr>	
				<td>실력무대</td>
				<td>
					<select>
						<option>선택</option>
						<option>보컬</option>
						<option>댄스</option>
						<option>랩</option>	
		    		</select>   
				</td>				
			</tr>
			
			<tr>
				<td>매력무대</td>
				<td><input type="text"></td>
			</tr>
			
			
			<tr>
				<td colspan="2">
					<button>저장</button>
					<button>취소</button>		
				</td>					
			</tr>		
	</table>
		




</body>
</html>