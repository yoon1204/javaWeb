package test;

import java.util.ArrayList;

public class AcornService {
	AcornDAO dao=new AcornDAO();
	
	public ArrayList<Customer> getSelectAll(){
		ArrayList<Customer> list=dao.selectAll();
		
		return list;
	}
}
