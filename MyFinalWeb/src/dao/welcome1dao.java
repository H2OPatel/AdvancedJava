package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonInfo;

public class welcome1dao {
	
	String url = "jdbc:mysql://localhost:3306/userapp";
	String uname = "root";
	String pwd = "Nirvana#420";
	String driver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver (String driver) 
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() 
	{
			Connection con = null;
			try {
				con = DriverManager.getConnection(url,uname,pwd);
			} catch (SQLException e) {
				System.out.println("problem");
				e.printStackTrace();
			}
			return con;
	}
	
	public String insert (PersonInfo personalInfo) 
	{
		loadDriver(driver);
		Connection con = getConnection();
		String result ="Data entered Successfully";
		String sql = "insert into userapp.personinfo values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, personalInfo.getFirstname());
			ps.setString(2, personalInfo.getMiddlename());
			ps.setString(3, personalInfo.getLastname());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		
		return result;
	}
	

}
