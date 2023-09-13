package cartPrj;

import java.util.Random;

public class ItemService {

	//상품코드로 상품정보 조회하기 서비스
	public String getItem(String code) {		
		//
		//return "상품정보";		
		Random r=new Random();
		String[] goodsList= {"바지", "티셔츠", "신발"};
		int index=r.nextInt(3);	// 0,1,2
		return goodsList[index];
	}
	
}
