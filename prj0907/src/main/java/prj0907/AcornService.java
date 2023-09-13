package prj0907;

import java.util.ArrayList;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	public ArrayList<Student> getStudentList(){
		
		ArrayList<Student> list = dao.selectAll();
		return list;
	}
}
