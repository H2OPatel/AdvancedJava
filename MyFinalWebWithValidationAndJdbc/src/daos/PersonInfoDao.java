package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonInfo;

public class PersonInfoDao {
	
	String url = "jdbc:mysql://localhost:3306/userapp";
	//			  jdbc:mysql://localhost:3306/user
	String uname = "root";
	String pwd = "Nirvana#420";
	String driver ="com.mysql.cj.jdbc.Driver";
	
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
	
	public String insert (PersonInfo personinfo)
	{
		loadDriver(driver);
		Connection con = getConnection();
		String sql = "insert into userapp.personinfo values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, personinfo.getFirstname());
			ps.setString(2, personinfo.getMiddlename());
			ps.setString(3, personinfo.getLastname());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
