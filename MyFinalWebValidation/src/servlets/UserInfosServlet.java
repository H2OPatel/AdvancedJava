package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UserInfo;
import utilities.ProjectUtilities;


@WebServlet("/uis")
public class UserInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserInfosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//==============================================Read===============================================================
		
		String userId = request.getParameter("userid");
		String passWord = request.getParameter("password");
		
		
//===============================================VALIDATION===============================================================		
		
		String errorMsg = "";
		
		if (ProjectUtilities.isBlank(userId) || !ProjectUtilities.isValidUid(userId)) {
			
			errorMsg += "User ID can't be blank.<br/>"+"User ID must start with a letter.<br/>"
			+"It can contain only letters, numbers, and underscores (_).<br/>"
			+"Please enter a valid User ID.<br/>";
		}
		
		if (ProjectUtilities.isBlank(passWord) || !ProjectUtilities.isValidPassword(passWord)) {
			
			errorMsg += " The Password must be 6 to 15 characters.<br/>"
			+" Please Check and enter a valid Password.<br/>";
		}
//===============================================RESPONSE===============================================================	
		
		
		if (ProjectUtilities.isBlank(errorMsg)) {
			
			UserInfo user = new UserInfo();
			user.setUid(userId);
			user.setPwd(passWord);
			
			HttpSession ses = request.getSession(true);
			ses.setAttribute("userdata", user);
			response.sendRedirect("jsp/welcome.jsp");
		} else {
			
			RequestDispatcher rd = request.getRequestDispatcher("jsp/UserInfo.jsp");
			request.setAttribute("errors", errorMsg);
			rd.forward(request, response);
		}
	}

}
