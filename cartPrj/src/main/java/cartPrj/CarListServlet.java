package cartPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cartList")
public class CarListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//세션에서 장바구니 목록 가져오기
		HttpSession session=req.getSession();
		ArrayList<String> list= (ArrayList<String>)session.getAttribute("cartList");
		
		req.setAttribute("cartList", list);
		req.getRequestDispatcher("WEB-INF/views/cartList.jsp").forward(req, resp);
	
	}
}
