package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExTestTest {
	
	ExTest t=new ExTest();

	@Test
	void testAdd() {
		
		assertEquals(10,t.add(5,5));
		//fail("Not yet implemented");
	}

	@Test
	void testSub() {
		
		assertEquals(5,t.sub(6,1));
		//fail("Not yet implemented");
	}

	@Test
	void testMulti() {
		
		assertEquals(10,t.multi(2,5));
		//fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		
		assertEquals(5,t.div(10,2));
		//fail("Not yet implemented");
	}

}
