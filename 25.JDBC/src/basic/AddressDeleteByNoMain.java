package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDeleteByNoMain {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@124.198.47.195:1521:xe";
		String user="jdeveloper09";
		String password="jdeveloper09";
		String deleteSql = "delete from address where no=3";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(update)
		 5.SQL문전송(update)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		/*
		 << int executeUpdate(String sql) throws SQLException >>
		 	Executes the given SQL statement, 
		 	which may be an INSERT, UPDATE, 
		 	or DELETE statement or anSQL statement that returns nothing,
		 	such as an SQL DDL statement. 
		 */
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">>delete row count:"+rowCount);
		stmt.close();
		con.close();
		
		
		
				

	}

}
