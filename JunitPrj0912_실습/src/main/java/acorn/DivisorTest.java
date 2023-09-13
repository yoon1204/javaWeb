package acorn;

import java.util.ArrayList;

public class DivisorTest {

	public ArrayList<Integer> divisor(int a) {
		 ArrayList<Integer> divisors = new ArrayList<>();
	        for (int i = 1; i <= a; i++) {
	            if (a % i == 0) {
	                divisors.add(i);
	            }
	        }
	        return divisors;
	}
}

