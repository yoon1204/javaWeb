package acorn;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DivisorTestTest {

	
	
	@Test
	public void testDivisor() {		
		 DivisorTest divisorTest = new DivisorTest();
	        ArrayList<Integer> result = divisorTest.divisor(12); // 약수를 찾을 수

	        // 약수는 1, 2, 3, 4, 6, 12가 되어야 합니다.
	        ArrayList<Integer> expected = new ArrayList<>();
	        expected.add(1);
	        expected.add(2);
	        expected.add(3);
	        expected.add(4);
	        expected.add(6);
	        expected.add(12);

	        // 결과와 예상 값 비교
	        assertEquals(expected, result);
	    }
	}