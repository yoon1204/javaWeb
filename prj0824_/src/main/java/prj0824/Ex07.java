package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/*출력")
public class Ex07 extends HttpServlet{
	
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");	
	response.setCharacterEncoding("utf-8");	
	
	PrintWriter out=response.getWriter();
	
	out.println("<html>");				
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");	
	for(int i=0;i<5;i++) {
		out.print("*****");
	};
	out.println("<br>");
	for(int j=0;j<5;j++) {
		for(int i=0;i<=j;i++) {
			out.print("*");
		}
	}
	out.println("</body>");
	out.println("</html>");
}
}
