package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {

	AcornDAO dao=new AcornDAO();
	@Test
	void testSelectAll() {
		//fail("Not yet implemented");
		
		//assertTrue(dao.selectAll() !=null);
		assertTrue(dao.selectAll().size()>=1 );
		
	}
	@Test
	void testSelectAll2() {
		//String[] query= {"dy", "yj"};
		//assertTrue(dao.selectAll2(query).size()==2);
		
		// String[]  query = { "dy", "yj"};
	 	 assertTrue(  dao.selectAll2(  new String[] {"dy", "yj"} ).size() ==2) ;
		
	 	 //String[] strs= {"one","two","three"};
	 	 //String[] strs2=new String[]{"one","two","three"};
	 		 
}
}
