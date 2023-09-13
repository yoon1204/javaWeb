package prj0901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.proxy.annotation.Pre;

public class MegacoffeeDAO {

	// db연동
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

	// 전체 데이터 조회
	public ArrayList<Megacoffee> selectAll() {

		Connection con = dbcon();

		String sql = "select * from goodstbl";

		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<Megacoffee> list = new ArrayList<>();

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {

				String id = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);

				Megacoffee coffee = new Megacoffee(id, name, price);

				list.add(coffee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(rs, pst, con);
		return list;

	}

	// 1건 데이터 조회
	public Megacoffee selectOne(String id) {

		Connection con = dbcon();

		String sql = "select * from goodstbl where id = ? ";
		PreparedStatement pst = null;
		ResultSet rs = null;

		Megacoffee megacoffee = null;

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			// 조회는 executeQuery사용
			rs = pst.executeQuery();

			if (rs.next()) {
				String id_tmp = rs.getString(1);
				String name_tmp = rs.getString(2);
				String price_tmp = rs.getString(3);

				megacoffee = new Megacoffee(id_tmp, name_tmp, price_tmp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 자원해제
		close(rs, pst, con);
		return megacoffee;

	}

	// 데이터 등록
	public void insertOrder(Megacoffee megacoffee) {
		Connection con = dbcon();

		String sql = "insert into goodstbl values(?,?,?)";
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, megacoffee.getId());
			pst.setString(2, megacoffee.getName());
			pst.setString(3, megacoffee.getPrice());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, con);

	}

	// 데이터 변경
	public void updateOrder(Megacoffee megacoffee) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		String sql = "update goodstbl set name = ? , price = ? where id = ? " ;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, megacoffee.getName());
			pst.setString(2, megacoffee.getPrice());
			pst.setString(3, megacoffee.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, con);
	}
	
	
	
	
	// 데이터 삭제
	public void deleteOne(String id) {
		Connection con = dbcon();
		String sql = "delete from goodstbl where id= ? ";
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		close(pst, con);
		
	}
	
	
	
	
	// 자원 반납
	public void close(AutoCloseable... a) {
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MegacoffeeDAO dao = new MegacoffeeDAO();
		dao.updateOrder(new Megacoffee("c010", "카푸치노", "3500"));

	}
}
