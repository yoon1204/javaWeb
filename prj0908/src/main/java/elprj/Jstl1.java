package elprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl1")
public class Jstl1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String[] books= {"부의 인문학", "c언어를 배우기 전 알아야 할 것들", "빌린돈은갚지마라"};	
		
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl1.jsp").forward(req, resp);
	}

}
