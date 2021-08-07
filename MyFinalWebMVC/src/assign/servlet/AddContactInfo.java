package assign.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import assign.dbaccess.ContactInfoBO;
import assign.dbaccess.ContactInfoVOO;
import assign.dbaccess.EMailValidationException;


@WebServlet("/aci")
public class AddContactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddContactInfo() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errors ="";
		String add = request.getParameter("Address");
		String cty = request.getParameter("City");
		String ste = request.getParameter("State");
		String ctr = request.getParameter("Country");
		String phn = request.getParameter("Phone"); 
		
		ContactInfoVOO contactInfoVOO = new ContactInfoVOO(add,cty,ste,ctr,phn);
		ContactInfoBO contactInfoBO = new ContactInfoBO();
		try {
			contactInfoBO.addContactInfo(contactInfoVOO);
		} catch (EMailValidationException e) {
			// TODO Auto-generated catch block
			errors = e.getErrorMessage();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (errors == null) {
			HttpSession ses = request.getSession();
			ses.setAttribute("contactinfo", contactInfoVOO);
			response.sendRedirect("/MyFinalWebMVC/home.jsp");
		} else {
			request.setAttribute("Errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("/contactInfo.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
