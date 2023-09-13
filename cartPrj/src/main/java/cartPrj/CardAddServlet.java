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
public class CardAddServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String code=req.getParameter("code");
		System.out.println("code");		
		
		System.out.println(code);
		
		//세션에 저장하기	
		HttpSession session=req.getSession();	
		Object cartList=session.getAttribute("cartList");
	
		//
		if(cartList != null) {			
			ArrayList<String> list=(ArrayList<String>)cartList;
			list.add(code);
			
		}else {
			//
			ArrayList<String> list=new ArrayList<>();
			list.add(code);			
			session.setAttribute("cartList", list);
		
		}
		
		resp.sendRedirect("/cartPrj/home");
		
	}
}
