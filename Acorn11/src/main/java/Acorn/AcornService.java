package Acorn;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	
	public ArrayList<Member> getList() {
		
		AcornService service = new AcornService();
		ArrayList<Member> list = dao.selectAll();
		
		
		return list;
		
	}

}
