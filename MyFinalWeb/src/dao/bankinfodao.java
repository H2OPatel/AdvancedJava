package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.BankInfo;

public class bankinfodao {
	String url ="jdbc:mysql://localhost:3306/user";
	String uname ="root";
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
	
	public String insert (BankInfo bankinfo) 
	{
		loadDriver(driver);
		Connection con = getConnection();
		String result = "Data enterd Successfully..."; 
		String sql ="insert into user.bankinfo values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bankinfo.getBankname());
			ps.setInt(2, bankinfo.getAccountnumber());
			ps.setInt(3, bankinfo.getSsn());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "Data did not enter...";
		}
		return result;
	}

}
