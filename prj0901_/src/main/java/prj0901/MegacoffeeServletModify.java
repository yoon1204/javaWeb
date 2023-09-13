package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MGmodify")
public class MegacoffeeServletModify extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String newname = request.getParameter("name");
		String newprice = request.getParameter("price");
		
		MegacoffeeService s = new MegacoffeeService();
		Megacoffee megacoffee = new Megacoffee(id, newname, newprice);
		
		System.out.println(megacoffee);
		s.modifyOrder(megacoffee);
				
		
		request.getRequestDispatcher("WEB-INF/views/MegacoffeeUpdate.jsp").forward(request, response);
	
	
	}
	
}
