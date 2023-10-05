package TodoBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateStarflag")
public class BoardStarChangeServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("code");
		String starflag = req.getParameter("starflag");
		
		System.out.println("code" +  code);
		System.out.println( "starflag" + starflag);
		
		BoardDAO dao = new BoardDAO();
		dao.changeStar(code, starflag);
	}
}
