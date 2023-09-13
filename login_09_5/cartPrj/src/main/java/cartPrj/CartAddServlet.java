package cartPrj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/addCart")
public class CartAddServlet   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		String name  = req.getParameter("name");
		
		
		
		HttpSession session = req.getSession();
		Object result =  session.getAttribute("cartList");
		
		
		//세션에 cartList가 있는경우
		if( result != null) {
			ArrayList<String> cartList   = (ArrayList<String>) result;
			cartList.add(name);
		}else {  // 세션에  cartList가 없는 경우
			
			ArrayList<String> cartList   =  new ArrayList<String> ();
			cartList.add(name);
			session.setAttribute("cartList" , cartList);
			
		}
		
		
		
		req.getRequestDispatcher("WEB-INF/views/cartList.jsp").forward(req, resp);
	}

}
