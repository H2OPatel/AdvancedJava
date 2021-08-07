package assign.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assign.dbaccess.EMailValidationException;
import assign.dbaccess.UserInfoBo;
import assign.dbaccess.UserInfoVOO;


@WebServlet("/aui")
public class AddUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddUserInfo() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errors ="";
		String uName = request.getParameter("userid");
		String pwd = request.getParameter("password");
		UserInfoVOO user = new UserInfoVOO(uName,pwd);
		
		UserInfoBo userInfoBo = new UserInfoBo();
		try {
			userInfoBo.addUserInfo(user);
		} catch (EMailValidationException emve){
			 errors = emve.getErrorMessage();
		 } catch (Exception e){
			 e.printStackTrace();
			 }
		if (errors.equals("")) {
			response.sendRedirect("/MyFinalWebMVC/home.jsp");
		} else {
			request.setAttribute("Errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("/UserInfo.jsp");
			rd.forward(request, response);
//			response.sendRedirect("/MyFinalWebMVC/UserInfo.jsp");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
