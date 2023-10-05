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
<h1>to do Memo</h1>
 <table border="1">
        <tr>
            <th>메모 코드</th>
            <th>내용</th>
            <th>조회/수정/삭제</th>
        </tr>
        <c:forEach var="memo" items="${boardmemo}">
            <tr>
                <td>${memo.m_code}</td>
                <td>${memo.m_contents}</td>
                <td>
                    <a href="<%=request.getContextPath()%>/MemoViewServlet?m_code=${memo.m_code}">조회</a>
                    <a href="<%=request.getContextPath()%>/MemoUpdateServlet?m_code=${memo.m_code}">수정</a>
                    <a href="<%=request.getContextPath()%>/MemoDeleteServlet?m_code=${memo.m_code}">삭제</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="<%=request.getContextPath()%>/MemoRegister.jsp">메모 등록</a>


</body>
</html>