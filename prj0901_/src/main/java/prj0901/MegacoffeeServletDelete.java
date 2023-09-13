package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MGdelete")
public class MegacoffeeServletDelete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		
		MegacoffeeService s = new MegacoffeeService();
		s.deleteOrder(id);
				
		
		request.getRequestDispatcher("WEB-INF/views/MegacoffeeDelete.jsp").forward(request, response);
	
	
	}
	
}
