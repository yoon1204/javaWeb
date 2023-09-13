package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl3")
public class Jstl3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	
		//Integer kor=90;
		int kor=90;
		req.setAttribute("score", kor);
		req.getRequestDispatcher("WEB-INF/views/jstl3.jsp").forward(req, resp);
	
	}

}
