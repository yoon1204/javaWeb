package prj0831_;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mvc3")
public class MVCServlet3 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//model 얻어오기
		
		ServiceMVC3 s=new ServiceMVC3();
		String[] result=s.getFavorites();
		
		
		//view forword
		//model심기
		request.setAttribute("likes", result);
		request.getRequestDispatcher("WEB-INF/views/mvc3.jsp").forward(request, response);
		
	}
}
