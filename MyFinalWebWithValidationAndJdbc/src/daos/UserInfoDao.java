package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.UserInfo;

public class UserInfoDao {
	
	String url = "jdbc:mysql://localhost:3306/userapp";
	//            jdbc:mysql://localhost:3306/user
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
	
	public Connection getConnection () 
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert (UserInfo userinfo) 
	{
		loadDriver(driver);
		Connection con = getConnection();
		String sql ="insert into userapp.userinfo values(?,?)";
		String result = "Data has entered Successfully...";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userinfo.getUid());
			ps.setString(2, userinfo.getPwd());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data did not enter...";
		}
		return result;
	}

}
