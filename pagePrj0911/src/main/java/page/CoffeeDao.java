package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoffeeDao {
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	Connection con = null;
	
	public ArrayList<Coffee> getListPage(int page, int pageSize){
	
	int start=(page-1)*pageSize+1;
	int end=page*pageSize;
	
	ArrayList<Coffee> list= new ArrayList<>();
	try {
	dbCon();
	String sql="select code, name, price";
		sql+=" from ";
		sql+="   (";
		sql+=" select rownum num, code, name, price";
		sql+=" from coffeetbl ";
		sql+=") ";
		sql+=" where num between ? and ? ";
	PreparedStatement pst=con.prepareStatement(sql);
	
	pst.setInt(1, start);
	pst.setInt(2, end);
	ResultSet rs=pst.executeQuery();
	
	while(rs.next()) {
		Coffee c=new Coffee(rs.getString(1), rs.getString(2), rs.getString(3));
		list.add(c);
	}
	
	rs.close();
	pst.close();
	con.close();
	
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
	}
	
	public int getTotal() {
		
		int count=0;
		try {
		dbCon();
		String sql="select count(*)from coffeetbl";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			count=rs.getInt(1);
		}
		
		rs.close();
		pst.close();
		con.close();
	
	} catch (SQLException e) {			 
		e.printStackTrace();
	}	 
	 
	 return count;	
	}

private void dbCon() {		
	try {
		Class.forName(driver);
		con =DriverManager.getConnection(url, user, password);
		if( con != null) { System.out.println("db ok");}
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

public String getseqString() {
	String seq="";
	String date="";
	String resultSeq="";
	try {
	dbCon();
	String sql="select seqNo.nextval, sysdate from dual";
	PreparedStatement pst=con.prepareStatement(sql);
	
	ResultSet rs= pst.executeQuery();

	if(rs.next()) {
		seq=rs.getString(1);
		date=rs.getString(2);
	}
	
	resultSeq=seq+date;
	
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {			 
		e.printStackTrace();
	}	 
	 
	 return resultSeq;		
}

public static void main(String[] args) {
	CoffeeDao dao=new CoffeeDao();
	
	String result=dao.getseqString();
	System.out.println(result);
}
}






