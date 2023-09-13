package SHINee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class SHINeeLoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("WEB-INF/views/SHINeeLogin.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String id=req.getParameter("id");
	String pwd=req.getParameter("pwd");
	
	
	if(id.equals(pwd)) {
		HttpSession session=req.getSession();
	
		session.setAttribute("id", id);
		
		resp.sendRedirect("/SHINee/home");
		
	}else {
		resp.sendRedirect("/SHINee/login");
	}
	}
}
