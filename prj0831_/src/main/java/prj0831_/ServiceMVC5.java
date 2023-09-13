package prj0831_;

import java.util.ArrayList;

public class ServiceMVC5 {
	
	
	
	public ArrayList<Member>getList(){
		
		
		ArrayList<Member>list=new ArrayList<>();
		
		list.add(new Member("dy", "4482", "곽단야"));
		list.add(new Member("mg","1234", "김민규"));
		list.add(new Member("mj" ,"0000" , "김민지"));
		list.add(new Member("bj","6666","김병진"));
		list.add(new Member("jy", "1127", "김재열"));
		list.add(new Member("hs", "0317", "김현수"));
		list.add(new Member("nj","9876","문나정"));
		list.add(new Member("tm", "4482", "박태민"));
		list.add(new Member("yj","0117","서예진"));
		list.add(new Member("y","1126","이윤"));
		list.add(new Member("yj2","0625","이윤정"));
		list.add(new Member("jh","6789","이정훈"));
		list.add(new Member("ek", "1234", "조은경"));
		list.add(new Member("jt","1234","표준태"));
		list.add(new Member("jh1", "7777", "허재혁"));
		list.add(new Member("jh2", "9999", "허재화"));
		return list;	

	}
	
}
