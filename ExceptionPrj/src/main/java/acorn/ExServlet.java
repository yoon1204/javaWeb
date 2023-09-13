package acorn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex1")
public class ExServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int len=0;
		PrintWriter out=resp.getWriter();
		String str=req.getParameter("str");
		len=str.length();	
		out.println("length=>"+len);
		out.println("mission clear");		
		out.close();
	}
}
	

