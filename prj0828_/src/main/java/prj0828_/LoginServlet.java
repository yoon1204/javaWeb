package prj0828_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		PrintWriter out=response.getWriter();
		
		//사용자(클라이언트)정보 추출
		String userid=request.getParameter("userid");
		String userpw=request.getParameter("userpw");
		
		//비지니스 로직
		boolean result=true;
		
		//응답 정상적인 로그인, 아이디, 비번이 잘못된 경우
		
		if(result) { // 정상적인 아이디, 비번
			out.println(userid+"님 정상 로그인 환영합니다.!!");
			
		}else {
			out.println("아이디비번 확인하세요.!!");
		}
	
		out.close();
	}
}