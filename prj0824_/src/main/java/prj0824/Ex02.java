package prj0824;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hap222")
public class Ex02 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
						// 키 이름으로 value 값을 얻어올 수 있다
		
		response.setContentType("text/html");	// 서버가 보내는 데이터의 형식 html 형식임을 알려줌 "tet/plain"
		response.setCharacterEncoding("utf-8");
		
		
		
		String su1_=request.getParameter("su1");
		String su2_=request.getParameter("su2");
		 
		
		int su1=Integer.parseInt(su1_);
		int su2=Integer.parseInt(su2_);
		
		 
		
		int sum=su1+su2;
		int sum2=su1-su2;
		int sum3=su1*su2;
		int sum4=su1/su2;
		
		PrintWriter out=response.getWriter();
		
		out.println("<html>");					// html, css
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2> hi servlet ! <h2>");
		out.print(sum);
		out.print("<br>");
		out.print(sum2);
		out.print("<br>");
		out.print(sum3);
		out.print("<br>");
		out.print(sum4);
		out.println("</body>");
		out.println("</html>");
		
	}
}
