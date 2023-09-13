package survey_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/result")
public class ResultServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String flower=request.getParameter("flower");
		//get일 때 주소창에 뜨고 post일 때는 주소창에 안 뜸(get일 때 doGet, post일 때 doPost)
		
		//좋아하는 동물 정보
		HttpSession session=request.getSession();
		String animal=(String)session.getAttribute("animal");
		
		System.out.println(animal);
		//좋아하는 꽃정보
		//데이터 심기
		request.setAttribute("flower", flower);
		request.setAttribute("animal", animal);
		
		request.getRequestDispatcher("WEB-INF/views/result.jsp").forward(request, resp);
	}
}
