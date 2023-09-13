package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/order")
public class Order  extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		//세션이 있는 경우		
		HttpSession session = request.getSession();
		String id  = (String) session.getAttribute("id");
		
		if( id != null) {
		
			// 해당id의 주문정보 가져오기(dao사용)
			request.getRequestDispatcher("WEB-INF/views/order.jsp").forward(request, response);			
		}
		else {
			response.sendRedirect("/sessionPrj/login");
		}
		
	}
}
