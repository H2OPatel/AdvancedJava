package servlet;

import java.io.IOException;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormValidation")
public class FormValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	HashMap<String, UserData> map = new HashMap<>();
	
    public FormValidation() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		if(!map.containsKey(userid)) {
			UserData user = new UserData(username,userid,pwd,email,phone);
			map.put(userid, user);
			response.getWriter().append("You have been registered");
		}else {
			response.getWriter().append("User ID -> " + userid +" <- already exist..");
		}
		
	}

}
