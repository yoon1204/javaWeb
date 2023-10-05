package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Acorn")
public class AcornServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Model

		AcornService s = new AcornService();
		
		ArrayList<String> list = s.getMemberRealList();
		System.out.println(list);

		// Model 심기
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(request, response);

	}
}
