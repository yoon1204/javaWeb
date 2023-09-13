package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieDAO {

	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="scott";
	  String password="tiger";	 
	   
	  
	  public Connection dbcon() {
		  Connection con=null;
		  try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			if(con != null)	System.out.println("ok");
		  } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		  } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return con;
	  }
	  




	  public ArrayList<Movie> getMovieList(){
	  
	  Connection con=dbcon();
	  String sql="select * from movietbl";
	  ArrayList<Movie> list=new ArrayList<>();
	
	  try {
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			String name=rs.getString(1);
			String ranking=rs.getString(2);
			
			Movie movie=new Movie(name, ranking);
			list.add(movie);
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
		  MovieDAO m=new MovieDAO();
		  ArrayList<Movie> list=m.getMovieList();
		  System.out.println(list);
	  }
}
