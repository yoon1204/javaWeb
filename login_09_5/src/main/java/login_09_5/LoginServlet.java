package login_09_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//로그인처리 사용자인지 확인해야함 서비스, dao가 필요함
		
		//아이디와 비번이 동일하면 정상로그인
		//아니면 다시 로그인화면으로 
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		
		
		System.out.println(id);
		System.out.println(pwd);
		
		//아이디와 비번이 동일하면 정상로그인으로 간주
		if(id.equals(pwd)) {		
			//메인페이지로 이동
			//로그인성공시 ==> 세션저장소에 아이디를 저장해 놓음
			HttpSession session=req.getSession();
			
			session.setAttribute("id", id);
			
			resp.sendRedirect("/login_09_5/home");	
			
		}else {
			//로그인화면으로 
			resp.sendRedirect("/login_09_5/login");
		}
		
	}
	
}
