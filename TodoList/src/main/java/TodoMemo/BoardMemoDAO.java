package TodoMemo;

import java.sql.*;
import java.util.ArrayList;

import TodoMemo.BoardMemo;

public class BoardMemoDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public ArrayList<BoardMemo> selectAll() {
		Connection con = dbcon();
		String sql = "select * from memo_tbl";
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<BoardMemo> list = new ArrayList<BoardMemo>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery(); // 조회할 때 executeQuery 사용

			while (rs.next()) {
				String m_code = rs.getString(1);
				String m_contents = rs.getString(2);
				list.add(new BoardMemo(m_code, m_contents));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, pst, con);
		return list;
	}

	public BoardMemo selectOne(String m_code) {

		// db연결
		Connection con = dbcon();

		// sql 
		String sql = "select * from memo_tbl where m_code=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		BoardMemo m = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, m_code);

			// sql 실행
			// sql 실행한 결과 BoardMemo 객체로 만들기
			rs = pst.executeQuery();

			if (rs.next() == true) {
				String m_code_tmp = rs.getString(1);
				String m_contents_tmp = rs.getString(2);

				m = new BoardMemo(m_code_tmp, m_contents_tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 자원해제
		close(rs, pst, con);
		return m;

	}

	// 등록
	public void memoInsert(String m_contents) {
		// db연결
		Connection con = dbcon();
		// sql작성
		String sql = "insert into memo_tbl values(seq_memo.nextval ,?)";
		PreparedStatement pst = null;
		
		try {
			// sql실행
			pst = con.prepareStatement(sql);
			pst.setString(1, m_contents);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결해제
		close(pst, con); // rs는 사용하지 않았으니까 제외
	}

	// 삭제
	public void memoDelete(String m_code) {
		
		Connection con = dbcon();
		
		String sql = "delete from memo_tbl where m_code = ?";
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, m_code);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(pst, con);
	}

	//수정
	public BoardMemo updateMemo(String code, String contents) {
		
		Connection con = dbcon();
		
		String sql = "update memo_tbl set m_contents = ?  where m_code=?";
		PreparedStatement pst = null;		 
		BoardMemo updateMemo = new BoardMemo(code, contents);
				
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, contents);
			pst.setString(2, code);			
			pst.executeUpdate();  // 등록, 변경, 삭제일 때 executeUpdate 사용
						 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(con, pst);
		return updateMemo;
	}

	public void close(AutoCloseable... a) {
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		BoardMemoDAO dao = new BoardMemoDAO();
		// dao.dbcon();
	//	ArrayList<BoardMemo> list = dao.selectAll();	
	//	System.out.println(list);
		
		dao.updateMemo("1001", "test");
	}
}
