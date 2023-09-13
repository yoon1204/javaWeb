package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {

	AcornDAO dao=new AcornDAO();
	@Test
	void testSelectAll() {
		//fail("Not yet implemented");
		//assertTrue는 어떤 조건이 참인지 검사하는 테스트 도우미 메서드
		//dao.selectAll().size()는 dao라는 데이터 액세스 객체를 사용하여 데이터베이스에서 모든 레코드를 선택한 후 그 결과 집합의 크기를 반환(이 크기가 1 이상이어야 함)
		assertTrue(dao.selectAll().size()>=1);
	}
	
	@Test
	void testSelectAll2() {
		//fail("Not yet implemented");
		//집합의 크기가 2여야 함을 검증
		//데이터베이스에서 "ek" 또는 "yj2"라는 조건을 만족하는 레코드가 정확히 2개여야 함
		assertTrue(dao.selectAll2(new String[] {"ek","yj2"}).size()==2);		
	}

}
