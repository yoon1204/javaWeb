package 추석실습;

import java.util.ArrayList;

public class programService {
	
	programDAO dao = new programDAO();
	
	
	public ArrayList<program> getList() {
		
		programService service = new programService();
		ArrayList<program> programs = dao.selectAll();
		
		
		return programs;
		
	}

}