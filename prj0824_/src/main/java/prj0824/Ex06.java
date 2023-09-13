package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/원하는단출력")
public class Ex06 extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	// 서버가 보내는 데이터의 형식 html 형식임을 알려줌 "tet/plain"
	response.setCharacterEncoding("utf-8");	// utf-8 형식으로 데이터를 보낸다는 의미

PrintWriter out=response.getWriter();
	
	out.println("<html>");				
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");	
	    int num = Integer.parseInt(request.getParameter("num"));
	    out.println(num+"단 출력");
	    for(int i=1; i<=9; i++) {
	        out.println(num+"*"+i);
	        out.println(num*i);
	    }
	out.println("</body>");
	out.println("</html>");
}
}
