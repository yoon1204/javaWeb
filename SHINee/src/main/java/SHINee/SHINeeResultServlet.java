package SHINee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/result")
public class SHINeeResultServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String album=req.getParameter("album");
		
	HttpSession session=req.getSession();
	String version=(String)session.getAttribute("vesion");
	
	System.out.println(album);
	
	req.setAttribute("album", album);
	req.setAttribute("version", version);
	
	req.getRequestDispatcher("WEB-INF/views/SHINeeResult.jsp").forward(req, resp);
	}
}
