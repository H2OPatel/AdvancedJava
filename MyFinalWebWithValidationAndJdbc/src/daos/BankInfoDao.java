package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.BankInfo;

public class BankInfoDao {
	String url = "jdbc:mysql://localhost:3306/userapp";
	String uname = "root";
	String pwd ="Nirvana#420";
	String driver = "com.mysql.cj.jdbc.Driver";
	public void loadDriver (String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public Connection getConnection () {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	//==========================
		public String insert (BankInfo bankinfo) {
		loadDriver(driver);
		Connection con = getConnection();
		String result = "Data Has Entered Successfully...";
		String sql = "insert into userapp.bankinfo values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bankinfo.getBankname());
			ps.setLong(2, bankinfo.getAccountnumber());
			ps.setLong(3, bankinfo.getSsn());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "Data did not entered....";
		}
		
		return result;
	}

}
