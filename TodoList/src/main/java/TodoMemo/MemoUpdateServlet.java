package TodoMemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateM")
public class MemoUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 수정
		String code = req.getParameter("code");
		String contents = req.getParameter("contents");
			
		// 수정할 메모의 코드와 내용을 설정해서 jsp 페이지로 전달
		req.setAttribute("code", code);
		req.setAttribute("contents", contents);
		// "WEB-INF/views/memoUpdate.jsp"로 포워드해서 메모를 수정하는 jsp 페이지로 이동
		req.getRequestDispatcher("WEB-INF/views/memoUpdate.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		
		String m_code=req.getParameter("m_code");
		String m_contents=req.getParameter("m_contents");
				
		BoardMemoService m = new BoardMemoService();
		m.modifyMemo(m_code, m_contents);
		
		// 메모 수정 후, 메모 목록 조회 페이지로 이동
		resp.sendRedirect(req.getContextPath()+"/inquiryM");		
	}
}
