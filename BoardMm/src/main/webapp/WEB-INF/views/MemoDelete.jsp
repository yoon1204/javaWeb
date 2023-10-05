<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Mdelete" method="post">
        <input type="hidden" name="m_code">
        <input type="hidden" name="m_contents"> 
          
    </form>
    
    <!-- 삭제 메시지를 출력 -->
    <div>
        메모가 삭제되었습니다.
    </div>
</body>
</html>