package 실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/실습8")
public class 실습8 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ArrayList<Coffee> list=new ArrayList<>();
		Coffee e = new Coffee("c001", "아메리카노", "2000");
		Coffee e2 = new Coffee("c002", "카페라떼", "2000");
		
		Coffee e3 = new Coffee("c003", "오렌지주스", "2000");
		
		list.add(e);
		list.add(e2);
		list.add(e3);
		list.add( new Coffee("c004", "바닐라라떼", "4000"));
		
		
		
		
		req.setAttribute("a", list);
		
		
		req.getRequestDispatcher("WEB-INF/views/실습8.jsp").forward(req, resp);
}
}
