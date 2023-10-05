package TodoReg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/mypage.do")
public class MypageServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RegService s = new RegService();
		HttpSession session = req.getSession();
		String login_id = (String) session.getAttribute("userId");
		User u = s.getUser(login_id);
		
		req.setAttribute("id", u);
		req.getRequestDispatcher("WEB-INF/views/mypage.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RegService s = new RegService();
		String login_id = req.getParameter("id");
		User u =  s.getUser(login_id);

		
		req.setAttribute("id", u);
		req.getRequestDispatcher("WEB-INF/views/modify.jsp").forward(req, resp);
		
	}
}
