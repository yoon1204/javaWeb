<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="<%=request.getContextPath()%>/Mmodify" method="post">
        <input type="hidden" name="m_code">
        <input type="hidden" name="m_contents"> 
          
    </form>
    
    <!-- 수정 메시지를 출력 -->
    <div>
        메모가 수정되었습니다.
    </div>
</body>
</html>