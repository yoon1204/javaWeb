package Board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class BoardServletDelete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String b_code = req.getParameter("b_code");
		String b_no = req.getParameter("b_no");
		String b_id = req.getParameter("b_id");
		String b_contents = req.getParameter("b_contents");
		String b_memo = req.getParameter("b_memo");
		String b_date = req.getParameter("b_date");
		String b_star = req.getParameter("b_star");
		String b_finished = req.getParameter("b_finished");
		
		BoardService b = new BoardService();
		
		
		req.getRequestDispatcher("WEB-INF/views/BoardDelete.jsp").forward(req, resp);
	}
}
