package assign.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactInfoDbAccess {

	public ContactInfoDbAccess() {
		super();
		
	}
	public static Connection getConnection () throws Exception {
		Connection con = null;
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
	public static void addContactInfoEntry(ContactInfoVOO contactInfoVOO) {
		Connection con = null;
		PreparedStatement ps = null;
		 int rowInserted = 0;
		
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO user.contactinfo1 VALUES(?,?,?,?,?)");
			ps.setString(1,contactInfoVOO.getAddress());
			ps.setString(2,contactInfoVOO.getCity());
			ps.setString(3,contactInfoVOO.getState());
			ps.setString(4,contactInfoVOO.getCountry());
			ps.setString(5,contactInfoVOO.getPhone());
			rowInserted = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	

}
}
