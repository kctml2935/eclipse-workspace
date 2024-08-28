package dao.address.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDao1 {
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@124.198.47.195:1521:xe";
	String user="jdeveloper09";
	String password="jdeveloper09";
		public void insert() throws Exception{
			
			String insertSql = "insert into address values(address_no_seq.nextval,'김경호','123-6779','서울시 여러분')";
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			
			int rowCount = stmt.executeUpdate(insertSql);
			System.out.println(">>insert row count:"+rowCount);
			stmt.close();
			con.close();
		}
		
		public void deleteByNo() throws Exception{
			
			String deleteSql = "delete from address where no=3";
			
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			
			int rowCount = stmt.executeUpdate(deleteSql);
			System.out.println(">>delete row count:"+rowCount);
			stmt.close();
			con.close();
			
		}
		public void updateByNo() throws Exception{
		
			String updateSql = "update address set name='김변경',phone='999-9999',address='부산시 여러분' where no=1";
			
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			
			int rowCount = stmt.executeUpdate(updateSql);
			System.out.println(">>update row count:"+rowCount);
			stmt.close();
			con.close();
		}
		
		public void selectByNo() throws Exception{
			
			
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
		
		public void selectAll() throws Exception{
			
			String selectSql = "select * from address";
			
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


