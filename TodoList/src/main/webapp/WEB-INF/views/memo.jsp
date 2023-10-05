<%@page import="TodoMemo.BoardMemo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Open+Sans&display=swap');

* {
	margin: 0 auto;
}

body{
font-family: 'Open Sans', sans-serif;
}

.wrap {
	text-align: center;
	margin: 0 auto;
}

hr {
	background: #e1dfdd;
	height: 1px;
	border: 0;
	margin-top: 15px;
	margin-bottom: 15px;
}

header {
	width: 100%;
	height: 48px;
	background-color: #2564cf;
	/*border: 1px solid black;*/
	position: relative;
	display: flex;
}

header img {
	width: 15px;
	height: 15px;
	margin-left: 10px;
	margin-top: 14px;
}

header .title {
	color: white;
	font-size: 16px;
	font-weight: bold;
	margin-left: 40px;
	position: absolute;
	top: 12px;
	left: 3px;	​
}

.logOutIcon {
	width: 35px;
	height: 35px;
	position: absolute;
	right: 10px;
	top: -8px;
	filter: invert(100%) sepia(0%) saturate(7499%) hue-rotate(169deg)
		brightness(125%) contrast(98%);
}

input {
	width: 293px;
	heigt: 20px;
	margin-top: 30px;
}

h2 {
	font-size: 56px;
	margin-top: 66px;
}

.tbclass {
  border-collapse: collapse;
  width: 500px;
  margin: 1rem auto;
  background-color: white;
}

/* 테이블 행 */
.test, th,  {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
  text-align: center;
}

th {
  background-color: #1b1b1b;
  color: #ddd;
}

/* 테이블 올렸을 때 */
tbody tr:hover {
  background-color: #d3d3d3;
  opacity: 0.9;
  cursor: pointer;
}

/* 테이블 비율 */
th:nth-child(1),
td:nth-child(1) {
  width: 15%;
}

th:nth-child(2),
td:nth-child(2) {
  width: 55%;
}

th:nth-child(3),
td:nth-child(3) {
  width: 30%;
}

tr:nth-child(even) {
  background-color: #fff6f6;
}

.modify {
	width: 58px;
	height: 26px;	
	border: 1px solid;
	color: white;
	border-radius: 7px;
	background-color: #0078d4;
}

.delete {
	width: 58px;
	height: 26px;
	border: 1px solid;
	color: white;
	border-radius: 7px;
	background-color: #0078d4;
}

.register {
	width: 58px;
	height: 26px;
	border: 1px solid;
	color: white;
	border-radius: 7px;
	background-color: #0078d4;
}

.goHome {
	width: 58px;
	height: 26px;
	border: 1px solid;
	color: white;
	border-radius: 7px;
	background-color: #0078d4;
}

.modify:hover{
	background:blue;
	color:white;
}

.delete:hover{
	background:blue;
	color:white;
}

.register:hover{
	background:blue;
	color:white;
}

.goHome:hover{
	background:blue;
	color:white;
}

.regBtn {
	margin-left: 19px;
	width: 350px;
	height: 32px;
	font-size: 15px;
	border: 0;
	border-radius: 15px;
	outline: none;
	padding-left: 10px;
	background-color: rgb(233, 233, 233);
}


</style>

</head>

<header>
	<img
		src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABQODxIPDRQSEBIXFRQYHjIhHhwcHj0sLiQySUBMS0dARkVQWnNiUFVtVkVGZIhlbXd7gYKBTmCNl4x9lnN+gXz/2wBDARUXFx4aHjshITt8U0ZTfHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHz/wAARCABUAFUDASIAAhEBAxEB/8QAGwABAAMBAQEBAAAAAAAAAAAAAAQFBgMCAQf/xAArEAACAgEDAgUEAgMAAAAAAAABAgADBAUREgYxEyFBUZEyYXGhIoEUQrH/xAAZAQACAwEAAAAAAAAAAAAAAAADBAABAgX/xAAfEQADAQEBAQADAQEAAAAAAAAAAQIRAxIxBCFhEzL/2gAMAwEAAhEDEQA/AISqzsFUEsTsAPWWqdPZroGJqQn/AFZjv+hPHTyo2prz23Ckr+Zro927VDxC3PmqWsweTjW4tprvQqw/c5TSdUKngUN5c+RA/G0zcPzv3Og7ny8OuNjW5VoroQsx/UsX6ezUQsDU5H+qsd/2JO6XVPAvby58gD+Npexbr3qaxBY5prWfn7KyMVYEMDsQfSfJZ9Qqi6m3DbcqC35lZGpr1KYFrHhLwtNyM4nwVAUd2Y7CdsvRMvFqNjBLFHfgd9po9HVF0zH4bbFdzt7+smEAgg9vWKV+RSr+B1yTR+fxOmQFXItCfSHIH43iOi58qtem1bK24up3Bl2nUzhALMZWf1IfYfG0oYmK5zf/AEjSpz8JOdnW513iXEeXkqjsBI0RNpJLEZb0k4Odbg3eJSR5+TKexEtX6mcoRXjKr+hL7j42lDExXOKetGldL9I922vda1ljcnY7kzxETZksdN1e7AU18RZV34k7bfgyRl9Q3X1GumoU8vIty3P9SmiDfKG9aNe6SzRERCGTrjY75V6U1DdmPxNCnTWOEHiXWl/UrsB/yVegWpVqa8ztyUqD95r4p36VNYg/KE1rMXqenPp9oUtzRvpbaQpouqLU8Omrf+fLlt7CZ2H5U6hNg7SVYibpmnPqFpUNwRfqbaXL9NY5Q+HdaH9C2xH/ACc+l7U8O6rf+fLlt7iX8V7dbV4g3OJc6zB5OO+Le9No2ZT8zlLLX7Ut1N+B34qFJ+8rY5DblNi9LHhb6Vopza/GvcpUewXuZKzOnEWkti2OXA34vsd/iWWjWpbplPA/QvEj2Ikx3VELuQFUbkmI12tWMzznyYAjY7GJ0vcWX2OvZmJHzE6Aqc5OTWM+tAi5DbD3AJ+SJBiU5T+otNr4erLHtcvYxdj3JO88xEso9V2PU4etijDsQdpMfWM+xCjZDbH2AB+QJBiU5T+otNr4IiJZR2xsu/Ectj2MhPfbsf6nTJ1LLyk4X3sy+wAA/UixK8rdwvX8EREsolabif5uYlJOy92P2msTTMKtAgxqiB6soJ+TMtpGWuHnJY/0EcWPsDNiliWIHrdWQ+YIPlEvyXSr+DHJLDMa7pteG6W0Datztx9jKiXfUWdVeUopYOEO7MO2/tKSM8vThegV56/Rb6FpteY723jetDtx9zL99MwrEKHGqAPqqgH5EpOnc6qgvRcwQOd1Y9t/aaN7ErQvY6qg8ySfKKd3asPzU+TF6lif4WY9IO691P2kWTdXy1zM57E+gDip9wJCjsb5W/Ras39Gl0XSaDjLkZCCx381DeYA/EmZmkYmRSVSlKn2/iyLt5/1OOhZ9V2JXQWC21jjxJ7j3EnZmZTh0my1wPLyX1J+0Qur/wBP6NSp8mIdSjsjd1OxiLXNlrue7MSf7idEUPMREhBERIQRESEEREhBERIQRESEP//Z">
	<p class="title">To Do Memo</p>

	<a href="/TodoTeamProject/logout"><img class="logOutIcon"
		src="https://img.icons8.com/material/24/000000/exit.png" alt="exit" /></a>
</header>

<body>

	<div class=wrap>
		<h2>To do Memo</h2>
		<%
		// jsp 페이지에서 java 코드를 사용해서 메모 목록 데이터를 받아옴
		ArrayList<BoardMemo> list = (ArrayList<BoardMemo>) request.getAttribute("list");
		%>

		<table class="tbclass">

			<%
			for (BoardMemo m : list) {
			%>

			<tr>
				<td><%=m.getM_code()%></td>
				<td><%=m.getM_contents()%></td>

				<td class="test">
					<form action="<%=request.getContextPath()%>/updateM" method="get">
						<!-- 수정 버튼을 클릭하면 메모의 정보를 수정 페이지로 전달 -->
						<input type="hidden" name="code" value="<%=m.getM_code()%>">
						<input type="hidden" name="contents"
							value="<%=m.getM_contents()%>">
						<button class="modify">수정</button>
					</form>
					<form action="<%=request.getContextPath()%>/deleteM" method="get">
						<!-- 삭제 버튼을 클릭하면 메모의 코드를 삭제 servlet으로 전달 -->
						<input type="hidden" name="del" value="<%=m.getM_code()%>"></input>
						<button class="delete">삭제</button>
					</form>
				</td>
			</tr>

			<%
			}
			%>
		</table>

		<div class="Reg">
			<form action="<%=request.getContextPath()%>/registerM" method="get">
				<input class="regBtn" type="text" name="contents"></input>
				<button class=register>등록</button>
			</form>
			<form action="<%=request.getContextPath()%>/main.do" method="get">
			<div class="wrapButton">
				<input class="goHome" type="submit" value="홈으로">
			</div>
			</form>
		</div>
	</div>

</body>
</html>