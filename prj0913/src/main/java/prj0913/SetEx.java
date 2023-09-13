package prj0913;

import java.util.HashSet;

public class SetEx {
	
	public static void main(String[] args) {
	
		//순서없음
		//중복을 허용하지 않음
		HashSet<String> fruits=new HashSet<>();
		
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
}
}
