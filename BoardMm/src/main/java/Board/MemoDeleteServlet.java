package Board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mdelete")
public class MemoDeleteServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {			
		req.getRequestDispatcher("WEB-INF/views/MemoDelete.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String m_code = req.getParameter("m_code");
		String m_contents = req.getParameter("m_contents");
	
		System.out.println(m_code);
		System.out.println(m_contents);
		
		BoardMemoService m = new BoardMemoService();
		m.deleteWrite(m_code);
		
		req.getRequestDispatcher("WEB-INF/views/MemoDelete.jsp").forward(req, resp);
		
	}
}
