package prj0901;

import java.util.ArrayList;



public class MegacoffeeService {

	MegacoffeeDAO dao = new MegacoffeeDAO();
	
	// 전체 조회
	public ArrayList<Megacoffee> getOrderListAll(){
		ArrayList<Megacoffee> list = dao.selectAll();
		return list;
	}

	
	// 한건 조회
	public Megacoffee getOrderListOne(String id) {
		Megacoffee megacoffee = dao.selectOne(id);
		return megacoffee;
	}
	
	
	// 등록
	public void registerOrder (Megacoffee megacoffee) {
		dao.insertOrder(megacoffee);
	}
	
	// 변경
	public void modifyOrder(Megacoffee megacoffee) {
		dao.updateOrder(megacoffee);
	}
	
	
	// 삭제
	public void deleteOrder(String id) {
		dao.deleteOne(id);
	}
}
