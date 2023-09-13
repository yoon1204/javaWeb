package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MGselectOne")
public class MegacoffeeServletSelectOne extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MegacoffeeService s = new MegacoffeeService();
		ArrayList<Megacoffee> list = s.getOrderListAll();
				
		
		request.setAttribute("megacoffee", list);
		request.getRequestDispatcher("WEB-INF/views/MegacoffeeSelectAll.jsp").forward(request, response);
	}
	
}
