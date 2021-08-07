package assign.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import assign.dbaccess.EMailValidationException;
import assign.dbaccess.UserInfoBo;


@WebServlet("/dui")
public class DeleteUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteUserInfo() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errors ="";
		String uName = request.getParameter("userid");
		
		UserInfoBo userInfoBo = new UserInfoBo();
		
		try {
			userInfoBo.deleteUserInfo(uName);
		} catch (EMailValidationException e) {
			// TODO Auto-generated catch block
			errors = e.getErrorMessage();
		}
		
		if (errors.equals("")) {
			HttpSession ses = request.getSession();
			response.sendRedirect("/MyFinalWebMVC/home.jsp");
		} else {
			request.setAttribute("Errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("DeleteUserInfo.jsp");
			rd.forward(request, response);
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
