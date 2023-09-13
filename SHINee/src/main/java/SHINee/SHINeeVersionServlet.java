package SHINee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/version")
public class SHINeeVersionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String version=req.getParameter("version");
		
	HttpSession session=req.getSession();
	
	
	req.getRequestDispatcher("WEB-INF/views/SHINeeVersion.jsp").forward(req, resp);
	}
}
