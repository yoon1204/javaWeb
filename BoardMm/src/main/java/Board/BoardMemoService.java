package Board;

import java.util.ArrayList;

import Board.BoardMemo;

public class BoardMemoService {
	
	BoardMemoDAO dao= new BoardMemoDAO();
	
	// 전체 조회
	public ArrayList<BoardMemo> getWriteListAll(){
		ArrayList<BoardMemo> list=dao.selectAll();		
		return list;
	}
	
	// 한건 조회
	public BoardMemo getWriteListOne(String code) {
		BoardMemo boardmemo = dao.selectOne(code);
		return boardmemo;
	}
	
	// 등록
	public void registerWrite (String m_code) {
		dao.insertWrite(m_code);
	}
	
	// 변경
	public void modifyWrite(String m_code) {
		dao.updateWrite(m_code);
	}
	
	// 삭제
	public void deleteWrite(String code) {
		dao.deleteOne(code);
	}
	
	}
