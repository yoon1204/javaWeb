<%@page import="Controller.BoardMemo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

h2{
text-align:center;
}

table{
width:300px;
height:20px;
border-collapse: collapse;
margin:0 auto;
text-align:center;
marin-top:50px;
}

td{
border:1px solid black;
}

input{
width:293px;
heigt:20px;
}

.button{
margin:0 auto;
border: 0px;
}

div{
margin-left:800px;
margin-top:30px;
}

</style>
</head>



<body>
<h2>to do Memo</h2>
<% ArrayList<BoardMemo> list=(ArrayList<BoardMemo>)request.getAttribute("boardmemo");%>

<table>
	
	
<% for(BoardMemo m: list) {%>

	<tr>
		<td><%=m.getM_code() %></td>
		<td><%=m.getM_contents() %></td>
		<td><button>수정</button><button>삭제</button></td>
	</tr>


<%} %>
</table>

 		<div class="Reg">
			<input type="text">
			<button>등록</button>         
        </div>
	
	



</body>
</html>