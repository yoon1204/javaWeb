package 실습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/실습4")
public class 실습4 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 // String[] bookNames = {  "소설" , "역사" , "인문",  "정치" , "미술" ,"종교" ,"여행", "과학"}  ; 
		 String[] bookNames = {  "소설" , "역사" , "인문",  "정치" , "미술" ,"종교" ,"여행", "과학"}  ; 
		
		req.setAttribute("bookNames", bookNames);
		req.getRequestDispatcher("WEB-INF/views/실습4.jsp").forward(req, resp);
}
}
