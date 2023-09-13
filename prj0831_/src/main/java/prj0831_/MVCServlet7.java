package prj0831_;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/good2")
public class MVCServlet7 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServiceMVC7 a=new ServiceMVC7();
		String[] result = a.list();
		
		request.setAttribute("good", result);
		request.getRequestDispatcher("WEB-INF/views/mvc4.jsp").forward(request, response);
	}
}
