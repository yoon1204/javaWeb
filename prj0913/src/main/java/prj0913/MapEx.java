package prj0913;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		
		// Map
		// 키,값의 형태로 데이터 저장함
		// 키,값
		HashMap<String, String> map=new HashMap<>();
			
		
		map.put("key1", "apple");
		map.put("key2", "banana");
		map.put("key3", "mango");
		
		
		String result1=map.get("key1");
		String result2=map.get("key2");
		String result3=map.get("key3");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	
		
		HashMap<String, ArrayList<String>> map2=new HashMap<>();
		
		ArrayList<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("mango");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("아메리카노");
		list2.add("라떼");
		list2.add("바닐라라떼");
		
		map2.put("fruit", list);
		map2.put("beverage", list2);
		
			
		ArrayList<String>resultList1=map2.get("fruit");
		for(String f:resultList1) {
			System.out.println(f);
		}
		
		ArrayList<String>resultList2=map2.get("beverage");
		for(String b:resultList2) {
			System.out.println(b);
		}
	}
	
}
