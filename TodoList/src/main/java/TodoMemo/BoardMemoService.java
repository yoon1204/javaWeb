package TodoMemo;

import java.util.ArrayList;

public class BoardMemoService {
	BoardMemoDAO dao = new BoardMemoDAO();

	// 메모 목록 조회
	public ArrayList<BoardMemo> getMemoRealList() {
		// 모든 메모 항목을 가져옴
		ArrayList<BoardMemo> list = dao.selectAll();
		return list;
	}

	// 메모 등록
	public void registerMemo(String contents) {
		dao.memoInsert(contents);
	}

	// 메모 조회
	public BoardMemo getMemo(String m_code) {
		// 특정 메모를 가져옴
		BoardMemo m = dao.selectOne(m_code);
		return m;
	}

	// 메모 수정
	public void modifyMemo(String m_code, String m_contents) {
		dao.updateMemo(m_code, m_contents);
	}

	// 메모 삭제
	public void deleteMemo(String m_code) {
		dao.memoDelete(m_code);
	}
}
