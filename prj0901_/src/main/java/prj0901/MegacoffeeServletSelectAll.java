package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MGselectAll")
public class MegacoffeeServletSelectAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		MegacoffeeService s = new MegacoffeeService();
		Megacoffee megacoffee = s.getOrderListOne(id);
				
		
		request.setAttribute("megacoffee", megacoffee);
		request.getRequestDispatcher("WEB-INF/views/MegacoffeeSelectOne.jsp").forward(request, response);
	}
	
}
