package SHINee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SHINee")
public class SHINeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String SHINee="test data";
		req.setAttribute("data",SHINee);
		req.getRequestDispatcher("WEB-INF/views/SHINeeTest.jsp").forward(req, resp);
	}
}
