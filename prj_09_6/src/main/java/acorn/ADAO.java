package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ADAO {
	
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="scott";
	  String password="tiger";	 
	  ;	
	
	
	public Connection dbcon(){	 
		Connection con =null;
		try {
			Class.forName(driver);
			con  =DriverManager.getConnection(url, user, password);
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
	
	
	public ArrayList<A>  getAList(){		
		
		 Connection con  =dbcon();		 
		 String sql=" select * from atbl; ";
		 ArrayList<A> list = new ArrayList<>();
		 
		 try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while( rs.next()){				
				 String name=rs.getString(1);
				 String price= rs.getString(2);
				 
				 A a = new A( name, place );
				 list.add(a);						 
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
	
	

	public static void main(String[] args){
		  ADAO a = new ADAO();
		  ArrayList<A> list  = a.getAList();	  
		  System.out.println(list);
		  
	}
	
	
}
