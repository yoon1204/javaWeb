package Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Board.BoardMemo;

public class BoardMemoDAO {
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
	
	public ArrayList<BoardMemo> selectAll(){
		Connection con=dbcon();
		String sql="select * from memo_tbl";
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		ArrayList<BoardMemo> list=new ArrayList<BoardMemo>();
	
		
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				String m_code=rs.getString(1);
				String m_contents=rs.getString(2);
				list.add(new BoardMemo(m_code,m_contents));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return list;
	}
	
	
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
	
	public static void main(String[] args) {
		BoardMemoDAO  dao = new BoardMemoDAO();
		//dao.dbcon();
		ArrayList<BoardMemo>  list= dao.selectAll();
		
		System.out.println( list);
		
	}
}