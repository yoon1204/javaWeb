package acorn;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<String>  getMemberList(){	
		
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("곽단야");
		list.add("김민규");
		list.add("김민지");		
		return list; 
	}	
	
	public ArrayList<Customer> getMemberRealList(){	
		 ArrayList<Customer> list  =dao.selectAll();
		 return list;
		
	}	
	
	 

}
