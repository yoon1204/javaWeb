package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
		//모델 ( 응답할 데이타와 데이타를 만드는 데 사용된 모든 클래스)
		
		//request 저장소로 사용가능함
		//요청단위의 정보를 공유하고 싶을 때
		//요청이 생길 때마다 새로운 request, response 객체가 생성됨
		String model="test data";		
		request.setAttribute("data", model);
		request.getRequestDispatcher("WEB-INF/views/testview.jsp").forward(request, response);
		
	}
}
