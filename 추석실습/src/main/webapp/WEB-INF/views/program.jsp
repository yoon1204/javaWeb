<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>TV 프로그램 목록</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            text-align: center;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>추석연휴 TV 프로그램 목록</h1>
    <table border="1">
        <tr>
            <th>제목</th>
            <th>장르</th>
            <th>편성시간</th>
        </tr>
        <c:forEach items="${programs}" var="program">
            <tr>
                <td>${program.getTitle()}</td>
                <td>${program.getGenre()}</td>
                <td>${program.getTime()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

