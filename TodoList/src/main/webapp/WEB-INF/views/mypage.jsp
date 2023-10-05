<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="TodoReg.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style>
.total {
	position: relative;
	width: 100%;
	border-top: 6px solid #0078d4;
	margin-top: -8px;
	/* border: 1px solid black; */
	font-family: "돋움", Dotum, "맑은 고딕", "Malgun Gothic", "Apple Gothic",
		sans-serif;
	justify-content: center;
	align-items: center;
	text-align: center;
}

.image-logo {
	width: 97px;
	height: 79px;
	margin-top: 45px;
	margin-bottom: 30px;
}

.wrap {
	border: solid 2px var(--GRAY125S, #e5e5e5);
	width: 580px;
	justify-content: space-between;
	margin: 0 auto;
}

.body {
	width: 600px;
	/* border: solid 2px var(--GRAY125S, #e5e5e5); */
	/* border: 1px solid black; */
	border-radius: 2px;
	margin: 0 auto;
	font-family: "Apple SD Gothic Neo", "Noto Sans KR", "맑은 고딕",
		"Malgun Gothic", 돋움, Dotum, sans-serif;
}

.btnmenu {
	width: 585px;
	height: 450px;
	margin: 0 auto;
}
form{
	margin:0 auto;
}
table{

margin: 24px 0px 0px 14px;
}


.tag{
	width: 145px;
	height:	67px;
}
.text{
	width:328px;
	border:0px;
	border-bottom: 1px solid rgba(0, 0, 0, 1);
	outline: none;
	margin-left: 15px;
}
.btn1{
	width: 100px;
	height: 30px;
	background-color: #7fc3ff;
	border-radius: 7px;
	border: none;
	margin-right: 38px;
}
.btn2{
	width: 100px;
	height: 30px;
	background-color: #7fc3ff;
	border-radius: 7px;
	border: none;
}
.btn1:hover{
	background-color: #3091e8;
}
.btn2:hover{
	background-color: #3091e8;
}

</style>
</head>
<%	
User u =(User) request.getAttribute("id"); 
%>

	<div class="total">
		<div class="img_header">
			<img
				src="https://to-do-cdn.microsoft.com/static-assets/c87265a87f887380a04cf21925a56539b29364b51ae53e089c3ee2b2180148c6/icons/logo.png"
				class="image-logo" alt="" />
		</div>
		<div class="wrap">
			<div class="body">
				<div class="btnmenu">
					<form method="post" name ="form" action="mypage.do">
				        <table>
				            <tr>
				                <td class="tag">아이디</td>
				                <td><input type="text" name="id"  class="text" value="<%=u.getId() %>" readonly></td>
				            </tr>
				            <tr>
				                <td class="tag">비밀번호</td>
				                <td><input type="password" name="pw"  class="text" value="<%=u.getPw() %>" readonly></td>
				            </tr>
				            <tr>
				                <td class="tag">이름</td>
				                <td><input type="text" name="name"  class="text" value="<%=u.getName() %>" readonly></td>
				            </tr>
				            <tr>
				                <td class="tag">생년월일</td>
				                <td><input type="text" name="birth"  class="text" value="<%=u.getBirth() %>" readonly></td>
				            </tr>
				            <tr>
				                <td class="tag">전화번호</td>
				                <td><input type="text" name="tel"  class="text" value="<%=u.getTel()%>" readonly></td>
				            </tr>
				            <tr>
				                <td colspan="2" class="tag"><input type="submit" class="btn1" value="수정하기">
				                <input type="button" class="btn1" value="회원탈퇴" onclick = "return del(this.form)">
				                <input type="button" class="btn2" value="뒤로가기" onclick = "return back()">
				                </td>
				            </tr>
				        </table>
				    </form>
				</div>
			</div>
		</div>
	</div>


<script>
function back(){
	window.location.href = 'main.do';
}
	
function del(n){
	let result = confirm("회원을 탈퇴하시겠습니까?");
	if(result == true){
		alert("탈퇴");
		n.action='u_del'; 
		n.submit();
		return true;
	}else{
		return false;
	}
}
</script>

</body>
</html>