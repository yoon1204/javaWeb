package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/3단")
public class Ex05 extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out=response.getWriter();
	
	out.println("<html>");					
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");	
	for(int i=1; i<=9;i++ ) {
		out.println( 3*i);
	}
	out.println("</body>");
	out.println("</html>");
	
	

}
}
