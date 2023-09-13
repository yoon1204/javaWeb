package prj0907;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
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
	
	public ArrayList<Student> selectAll() {
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "select * from acorntbl";
		
		ArrayList<Student> list = new ArrayList<>();
		
		try {
			// 데이터베이스 연결 3단계
			// 1. connection
			// 2. preparestatement of statement(connection이 갖고 있는 기능)
			// 3. resultset(statement가 갖고 있는 기능)
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				Student std = new Student(id, pw, name);
				
				list.add(std);
			}
			
			rs.close();
			pst.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		ArrayList<Student> list = dao.selectAll();
		System.out.println(list);
	}
	
}
