package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Qz1")
public class Qz1 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String su1_ = req.getParameter("su1");
		String su2_ = req.getParameter("su2");
		int su1 = Integer.parseInt(su1_);
	    int su2 = Integer.parseInt(su2_);
	    
	    int sum = su1 + su2;
	    PrintWriter out = resp.getWriter();
	    out.println(sum);
	    
	}
	
}
