package 추석실습;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/program")
public class programServlet extends HttpServlet {
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		programService service = new programService();
		ArrayList<program> list = service.getList();

        req.setAttribute("programs", list);
        req.getRequestDispatcher("WEB-INF/views/program.jsp").forward(req, resp);
    }
}