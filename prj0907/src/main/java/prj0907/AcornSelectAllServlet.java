package prj0907;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Web_selectAll")
public class AcornSelectAllServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		AcornService s = new AcornService();
		ArrayList<Student> list = s.getStudentList();
		
		request.setAttribute("Key_list", list);
		request.getRequestDispatcher("WEB-INF/views/selectAll.jsp").forward(request, response);
		
		
	
	}
}
