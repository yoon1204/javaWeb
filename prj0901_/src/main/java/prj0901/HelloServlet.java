package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 인사제공하기
// 학생리스트 제공하기(데이터베이스에서 조회된 결과)
@WebServlet("/hi")
public class HelloServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//모델 Service
		HelloService s=new HelloService();
		String message=s.getMessage();
		
		//모델 심기
		request.setAttribute("msg", message);
		//view로 forword
		request.getRequestDispatcher("WEB-INF/views/HiView.jsp").forward(request, response);
		
		
		
		
	}
	
}
