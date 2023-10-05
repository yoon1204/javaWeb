package 추석실습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class programDAO {

	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	String user="scott";
	String password="tiger";
	
	
	public Connection dbcon() {	
		Connection con = null;		 
			try {
				Class.forName(driver);
				con =DriverManager.getConnection(url, user, password);				
				if( con != null) System.out.println("ok");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		return con;
	}
	
	
	public ArrayList<program> selectAll() {
		
		
		Connection con = dbcon();
		
		String sql = "select * from tvprogram";
		
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		ArrayList<program> list = new ArrayList<>();
		
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String title = rs.getString(1);
				String genre = rs.getString(2);
				String time = rs.getString(3);
				
				list.add(new program(title, genre, time));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(rs, pst, con);
		
		return list;
	}
	
	
	private void close(AutoCloseable ...a) {
		for(AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public  static  void main(String args[]) {
		
		programDAO dao = new programDAO();
		ArrayList<program> list = dao.selectAll();
		System.out.println( list);
		
		
	}
	
	


}