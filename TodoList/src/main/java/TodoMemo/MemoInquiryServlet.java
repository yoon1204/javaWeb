package TodoMemo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/inquiryM")
	public class MemoInquiryServlet extends HttpServlet{
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			// 조회
			BoardMemoService m = new BoardMemoService();
			
			// 메모 목록을 조회해서 ArrayList에 저장
			ArrayList<BoardMemo> list = m.getMemoRealList();
			System.out.println(list);
			
			req.setAttribute("list", list);
			// "WEB-INF/views/memo.jsp"로 포워드해서 메모 목록을 표시하는 jsp 페이지로 이동
			req.getRequestDispatcher("WEB-INF/views/memo.jsp").forward(req, resp);	
	}
}
