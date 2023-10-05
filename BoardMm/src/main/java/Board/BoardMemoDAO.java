package Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Board.BoardMemo;

public class BoardMemoDAO {
	
	// db연동
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		 	
	}
	
	// 전체 데이터 조회
	public ArrayList<BoardMemo> selectAll(){
		
		Connection con=dbcon();
		
		String sql="select * from memo_tbl";
		
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		ArrayList<BoardMemo> list=new ArrayList<>();
	
		
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				
				String m_code=rs.getString(1);
				String m_contents=rs.getString(2);
				
				BoardMemo boardmemo = new BoardMemo(m_code, m_contents);
				
				list.add(boardmemo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return list;
	}
	
	// 1건 데이터 조회
	public BoardMemo selectOne(String code) {
		
		Connection con = dbcon();
		
		String sql = "select * from memo_tbl where m_code = ? ";
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		BoardMemo boardmemo = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, code);
			// 조회는 executeQuery사용
			rs = pst.executeQuery();
			
			if (rs.next()) {
				String m_code = rs.getString(1);
				String m_contents = rs.getString(2);
				
				boardmemo = new BoardMemo(m_code,m_contents);
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// 자원해제
			close(rs, pst, con);
			return boardmemo;
		}
		
		// 데이터 등록
		public void insertWrite(String code) {
			Connection con = dbcon();
			
			String sql = "insert into memo_tbl values(?,?)";
			PreparedStatement pst = null;
			
			try {
				pst = con.prepareStatement(sql);

				pst.setString(1, code);
				pst.setString(2, code);		
				
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			close(pst, con);

		}
		
		// 데이터 변경
		public void updateWrite(String code) {
			Connection con = dbcon();
			PreparedStatement pst = null;
			String sql = "update memo_tbl set m_contents = ? where m_code = ? " ;
			
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1, code);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			close(pst, con);
		}
		
		// 데이터 삭제
		public void deleteOne(String code) {
			Connection con = dbcon();
			String sql = "delete from memo_tbl where m_code= ? ";
			PreparedStatement pst = null;
			
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1, code);
				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			close(pst, con);
			
		}
	
	// 자원 반납
	public void close(AutoCloseable...a) {
		for(AutoCloseable item:a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}
		}
	}

	}
	
	
	
		
	
