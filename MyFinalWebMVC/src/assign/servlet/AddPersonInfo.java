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
import assign.dbaccess.PersonInfoBO;
import assign.dbaccess.PersonInfoVOO;


@WebServlet("/api")
public class AddPersonInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddPersonInfo() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errors = "";
		String fName = request.getParameter("fname");
		String mName = request.getParameter("mname");
		String lName = request.getParameter("lname");
		PersonInfoVOO personInfoVOO = new PersonInfoVOO(fName,mName,lName);
		
		PersonInfoBO personInfoBO = new PersonInfoBO();
		try {
			personInfoBO.addPersonInfo(personInfoVOO);
		} catch (EMailValidationException e) {
			errors = e.getErrorMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (errors == null) {
			HttpSession ses = request.getSession();
			ses.setAttribute("personinfo", personInfoVOO);
			response.sendRedirect("/MyFinalWebMVC/home.jsp");
		} else {
			request.setAttribute("Errors",errors);
			RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
