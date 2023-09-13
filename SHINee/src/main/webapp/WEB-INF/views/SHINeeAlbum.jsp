<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>구매할 앨범의 개수를 선택해주세요</h2>
<form action="/SHINee/SHINeeSurvey2" method="get">

<input type="text" name="album">
<select>
	<option>선택하세요</option>
	<option>1</option>
	<option>2</option>
	<option>3</option>
</select>
<button>구매</button>
</form>
</body>
</html>