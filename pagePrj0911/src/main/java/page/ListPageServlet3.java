package page;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list3.page")
public class ListPageServlet3 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String p=req.getParameter("p");
	int currentPage=1;
	if(p !=null) {
		currentPage=Integer.parseInt(p);
	}
	
	MemberDao2 dao=new MemberDao2();
	int totRecords=dao.getTotalCnt();
	int pageSize=2;
	int grpSize=4;	// [1] [2] [3] [4] [다음]
	
	// 현재페이지에 대한 목록 list
	// 페이징을 위한 값들
	//PageHandler handler=new PageHandler(currentPage, totRecords, pageSize, grpSize);
	PageHandler handler=new PageHandler(currentPage, totRecords, pageSize, grpSize);
	ArrayList<Member>list=dao.getListPage(currentPage,  pageSize);
	//현재페이지에 대한 목록 list
	
	
	req.setAttribute("list", list);
	req.setAttribute("handler", handler);
	
	req.getRequestDispatcher("WEB-INF/views/listPageJstl.jsp").forward(req, resp);

}
}
