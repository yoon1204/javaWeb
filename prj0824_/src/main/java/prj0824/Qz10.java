package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Qz10")
public class Qz10 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		int random = (int)(Math.random()*4);
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		if(random==0) {
			out.println("<img src = \"/prj0824_/img/vyypzQ.jpg \">");
		}
		else if(random==1) {
			out.println("<img src = \"/prj0824_/img/FcfISm.jpg \">");
		}
		else if(random==2) {
			out.println("<img src = \"/prj0824_/img/LXYWfI.jpg \">");
		}
		else if(random==3) {
			out.println("<img src = \"/prj0824_/img/DRcPPo.jpg \">");
		}
		
		out.println("</body>");
		out.println("<html>");
		
	}

}
