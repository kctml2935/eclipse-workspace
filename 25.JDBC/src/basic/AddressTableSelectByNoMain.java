package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class AddressTableSelectByNoMain {

	public static void main(String[] args) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@124.198.47.195:1521:xe";
		String user="jdeveloper09";
		String password="jdeveloper09";
		
		String selectSql = "select * from address where no=1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSql);
		if(rs.next()) {
			int no=rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
			
		}else {
			System.out.println(">>>주소록 친구없다.");
		}
		rs.close();
		stmt.close();
		con.close();
		
		
	}

}
