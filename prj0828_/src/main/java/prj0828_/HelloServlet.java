package prj0828_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset-utf-8");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out=response.getWriter();	
		String name=request.getParameter("name");
		
		if(name==null) {
			out.println("Guest hi~");
		}else {
			out.println(name+"hi~");
		}
		out.close();
	}
}
