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
	<h2>상품 정보</h2>
		<div class="jy_header"></div>
		<div class="jy_wrap">
			<div class="jy_body">

				<form name="frm" action="주문서.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">주문서 조회</button>
				</form>

				<form name="frm" action="cubeTBL.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">아이템 조회</button>
				</form>

				<form name="frm" action="weapon.jsp
" method="post"
					onsubmit="return check()">
					<button class = "btn">무기 조회</button>
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