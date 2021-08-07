package assign.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonInfoDbAccess {

	public PersonInfoDbAccess() {
		super();
		
	}
	
	public static Connection getConnection () {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Nirvana#420");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void addPersonInfoEntry(PersonInfoVOO personInfoVOO) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO user.personinfo VALUES(?,?,?)");
			ps.setString(1, personInfoVOO.getFirstname());
			ps.setString(2, personInfoVOO.getMiddlename());
			ps.setString(3, personInfoVOO.getLastname());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
