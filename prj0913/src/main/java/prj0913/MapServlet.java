package prj0913;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mapex")
public class MapServlet extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//service 통해서 model 얻어오기
		
		HashMap<String, ArrayList<String>> map=new HashMap<>();
		
		ArrayList<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("mango");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("아메리카노");
		list2.add("라떼");
		list2.add("바닐라라떼");
		
		map.put("fruit", list);
		map.put("beverage", list2);
		
		req.setAttribute("infos", map);
		req.getRequestDispatcher("WEB-INF/views/infos2.jsp").forward(req, resp);
		
	
	}
}
