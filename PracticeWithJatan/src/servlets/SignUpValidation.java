package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUpValidation")
public class SignUpValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SignUpValidation() {
        super();
        
    }

    String url = "jdbc:mysql://localhost:3306/demo";
	String uname = "root";
	String pwd = "Nirvana#420";
	//String insertQuery = "insert into user values ("+idEx+",'"+nameEx+"')";
	
    
    public void init(ServletConfig config) throws ServletException {
    	
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname1 = request.getParameter("username");
		String pword = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String createQuery = "insert into demo.userinfo values ('"+uname1+"','"+pword+"','"+email+"','"+phone+"')";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, uname, pwd);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			System.out.println("Executing Query..."+createQuery);
			int result = st.executeUpdate(createQuery);
			if(result==0) {
				System.out.println("Nothing Added!");
			}
			else {
				System.out.println(result + " rows inserted.");
			}
		}
		catch(Exception e) {
			System.out.println("Failed to execute Query :"+ createQuery);
			e.printStackTrace();
		}
		
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		boolean isValid = validateRegForm(request);
//		if (isValid) {
//			try {
//				insertIntoDatabase(request);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
	
	public void destroy() {
	
	
	}


//	private void insertIntoDatabase(HttpServletRequest request) throws Exception {
//		String url = "jdbc:mysql://localhost:3306//demo";
//		String uname = "root";
//		String pwd = "Nirvana#420";
//		String Query = "select username from user where userid=4;";
//		
//		Class.forName("com.sql.jdbc.Driver");//Mysql Driver
//		Connection con = DriverManager.getConnection(url, uname, pwd);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(Query);
//		
//		rs.next();
//		String name = rs.getString(2);
//		System.out.println(name);
//		
//		st.close();
//		con.close();
//		
//	}
//
//
//	private boolean validateRegForm(HttpServletRequest request) {
//		
//		String uname = request.getParameter("username");
//		String pword = request.getParameter("pwd");
//		String email = request.getParameter("email");
//		String phone = request.getParameter("phone");
//		
//		
//		
//		boolean flag = true;
//		
//		
//		return flag;
//	}

}
