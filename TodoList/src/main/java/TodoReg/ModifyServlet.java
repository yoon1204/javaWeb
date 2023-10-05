package TodoReg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/modi")
public class ModifyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RegService s = new RegService();
		String login_id = req.getParameter("id");
		User u =  s.getUser(login_id);

		
		req.setAttribute("id", u);
		req.getRequestDispatcher("WEB-INF/views/modify.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String birth = req.getParameter("birth");
		String tel = req.getParameter("tel");
		
		RegService s = new RegService();
		User u = new User(id,pw,name,birth,tel);
		s.changeUser(u);
		req.getRequestDispatcher("WEB-INF/views/main.jsp").forward(req, resp);
	}
	
}
