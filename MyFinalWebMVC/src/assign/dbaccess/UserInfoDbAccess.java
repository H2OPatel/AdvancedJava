package assign.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDbAccess {
	
	public UserInfoDbAccess() {
		super();
	}
	
	public static Connection getConnection () throws Exception {
		Connection con = null;
		
		
			//String url = "jdbc:mysql://localhost:3306/user";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Nirvana#420");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}
		
		return con;
	}
//	public static Connection getConnection() throws Exception{
//		Connection dbConn = null;
//    try{
//	String url = "jdbc:mysql://localhost:3306/test";
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	dbConn = DriverManager.getConnection(url, "root", "Nirvana#420");
//	}
//     catch (SQLException sqle) {
//	   sqle.printStackTrace();
//	   throw sqle;
//	}
//         catch(Exception e) {
//	   e.printStackTrace();
//	   throw e;
//	}
//return dbConn;
//}
	
	public static void addUserInfoEntry(UserInfoVOO userinfo) {
		Connection con = null;
		PreparedStatement ps = null;
		 int rowInserted = 0;
		
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO user.userinfo VALUES(?,?)");
			ps.setString(1, userinfo.getUserid());
			ps.setString(2, userinfo.getPassword());
			rowInserted = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void deleteUserInfoEntry(String userid) {
		Connection con = null;
		PreparedStatement ps = null;
		int rowdelted = 0;
		
		try {
			con = getConnection();
			ps = con.prepareStatement("delete from user.userinfo where username = ?");
			ps.setString(1, userid);
			rowdelted = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
