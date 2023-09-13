package prj0831_;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/a")
public class MVCServlet6 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	ServiceMVC6 m=new ServiceMVC6();
	ArrayList<String>list=m.getMovie();
	
	request.setAttribute("a", list);
	request.getRequestDispatcher("WEB-INF/views/movie2.jsp").forward(request, response);
	}

}
