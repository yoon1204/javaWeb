package survey_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/survey2")
public class SurveyServlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {		
		String animal=request.getParameter("animal");
		//사용자가 선택한 animal 정보 세션에 저장하기	
		//하나의 사용자가 사용할 수 있는 서버측 저장소 세션 사용하기
		
		//1. 세션객체 얻어오기
		HttpSession session=request.getSession();
		
		//2. 세션에 저장하기
		session.setAttribute("animal", animal);
		request.getRequestDispatcher("WEB-INF/views/survey2.jsp").forward(request, resp);
	}
}
