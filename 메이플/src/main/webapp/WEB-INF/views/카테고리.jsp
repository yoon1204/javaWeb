<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/category.css" rel="stylesheet" />
<script>
	function check() {
		return true;
	}
</script>
</head>
<body>
<div class="jy_total">
<h2> 유저 및 상품 </h2>
	
		<div class="jy_wrap">
			<div class="jy_body">
				<form name="frm" action="유저조회.jsp
  " method="post"
					onsubmit="return check()">
					<button>유저 조회</button>
				</form>

				<form name="frm" action="상품관리.jsp
  " method="post"
					onsubmit="return check()">
					<button>상품관리</button>
				</form>
				
		<form name="frm" action="메이플로그인.html
" method="post"
					onsubmit="return check()">
					<button class = "btn">로그아웃</button>
				</form>
				
			</div>
		</div>
	</div>
	
		<div class="backimage"></div>
</body>
</html>