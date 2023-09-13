package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz8")
public class Qz8 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/plane"); 
		PrintWriter out = resp.getWriter();
		int random = (int)(Math.random()*4);
		if(random==0) {
			out.println("화");
		}
		else if(random==1) {
			out.println("이");
		}
		else if(random==2) {
			out.println("팅");
		}
		else if(random==3) {
			out.println("!!");
		}
		
		
	}

}
