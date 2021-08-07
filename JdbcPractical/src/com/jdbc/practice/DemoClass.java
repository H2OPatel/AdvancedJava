package com.jdbc.practice;
import java.sql.*;

import com.mysql.cj.protocol.Resultset;

/*
 * 1. import -->java.sql
 * 2. load & register driver -->com.sql.jdbc.Driver
 * 3. creatre connection --> Connection
 * 4. create statement --> Statement
 * 5. execute query  -->
 * 6. process result  -->
 * 7. close
 */
public class DemoClass {

	public static void main(String[] args) throws Exception 
	{	
		String url = "jdbc:mysql://localhost:3306/demo";
		String uname = "root";
		String pwd = "Nirvana#420";
		String Query = "select * from user";
		int idEx = 7;
		String nameEx = "Dhikana";
		String insertQuery = "insert into user values ("+idEx+",'"+nameEx+"')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");//Mysql Driver
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		// try catch
		try {
			System.out.println("Executing Query..."+Query);
			ResultSet rs = st.executeQuery(Query);
			while(rs.next()) {
				int id = rs.getInt("userid");
				String name = rs.getString("username");
				// User newUser = new User(name, id);
				System.out.println("Id is : "+id+" & username is : "+name);
			}
		}
		catch(Exception e) {
			System.out.println("Failed to execute Query :"+ Query);
			e.printStackTrace();
		}
		try {
			System.out.println("Executing Query..."+insertQuery);
			int result = st.executeUpdate(insertQuery);
			if(result==0) {
				System.out.println("Nothing Added!");
			}
			else {
				System.out.println(result + " rows inserted.");
			}
		}
		catch(Exception e) {
			System.out.println("Failed to execute Query :"+ insertQuery);
			e.printStackTrace();
		}
		
		st.close();
		con.close();
			
			
	}

}
