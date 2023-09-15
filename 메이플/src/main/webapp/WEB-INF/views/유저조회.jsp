<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/user조회.css" rel="stylesheet" />
<script>
	function check() {
		return true;
	}
</script>
</head>
<body>
<div class="jy_total">
	<h2>유저 정보</h2>
	
		<div class="jy_header"></div>
		<div class="jy_wrap">
			<div class="jy_body">

				<form name="frm" action="playerlist2.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">등급 조회</button>
				</form>

				<form name="frm" action="서버.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">서버 조회</button>
				</form>

				<form name="frm" action="유저.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">유저 조회</button>
				</form>

				<form name="frm" action="VIP.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">VIP 조회</button>
				</form>
				<form name="frm" action="카테고리.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">홈으로</button>
				</form>
			</div>
		</div>
	</div>
	<div class="backimage"></div>
</body>
</html>