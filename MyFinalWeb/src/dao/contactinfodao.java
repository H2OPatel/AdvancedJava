package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.ContactInfo;

public class contactinfodao {
	
	String url ="jdbc:mysql://localhost:3306/user";
	String uname = "root";
	String pwd = "Nirvana#420";
	String driver = "com.mysql.jdbc.Driver";
	
	public void loadDriver (String driver) 
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection () 
	{	
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public String insert (ContactInfo contactinfo) 
	{
		loadDriver(driver);
		Connection con = getConnection();
		String result = "Data entered Successfully...";
		String sql = "insert into user.contactinfo values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, contactinfo.getAddress());
			ps.setString(2, contactinfo.getCity());
			ps.setString(3, contactinfo.getState());
			ps.setString(4, contactinfo.getCountry());
			ps.setInt(5, contactinfo.getPhone());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data did not enter...";
		}
		
		return result;
	}
	

}
