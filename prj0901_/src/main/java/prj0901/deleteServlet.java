package prj0901;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteOne")
public class deleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		AcornService s = new AcornService();
		s.deleteMember(id);
	
		Customer c = s.getMember(id);
		
		request.setAttribute("id", id);
		request.getRequestDispatcher("WEB-INF/views/delete.jsp").forward(request, response);

	}

}
