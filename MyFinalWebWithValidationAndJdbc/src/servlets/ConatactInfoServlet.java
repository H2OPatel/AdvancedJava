package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.ContactInfo;
import daos.ContactInfoDao;
import utilities.ProjectUtilities;


@WebServlet("/ci")
public class ConatactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//=================================================READ===============================================================================		
		
		
		String add = request.getParameter("Address");
		String cty = request.getParameter("City");
		String ste = request.getParameter("State");
		String ctr = request.getParameter("Country");
		Long phn = null;
		if (ProjectUtilities.isNumber(request.getParameter("Phone"))) {
			phn = Long.parseLong(request.getParameter("Phone"));
		}
		
		
		
		
//===============================================VALIDATION==========================================================================
		
		String errMsg ="";
		
		if (ProjectUtilities.isBlank(add)) {
			
			errMsg += " Street Address can't be blank<br/>";
		}
		if (isBlank(cty) || !ProjectUtilities.isValidCity(cty)) {
			
			errMsg += "CityName can't be blank.<br/>"
						+"City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_).<br/>"
						+"Please enter a valid CityName.<br/>";
		}
		if(isBlank(ste)) {
			errMsg += "StateName can't be blank<br/>";
		}
		if(isBlank(ctr)) {
			errMsg += "CountryName can't be blank<br/>";
		}
		if(phn == null || !ProjectUtilities.isValidPhone(request.getParameter("Phone")))  {
			errMsg += "PhoneNumber can't be blank<br/>"
						+"Phone number contains 10 digits.<br/>"
						+"Please enter a valid Phone number.<br/>";
		}
		
//===============================================RESPONSE=========================================================================================
		
		if (isBlank(errMsg)) {
			
			ContactInfo con = new ContactInfo(add,cty,ste,ctr,phn);
			ContactInfoDao cdao = new ContactInfoDao();
			cdao.insert(con);
			
//			con.setAddress(add);
//			con.setCity(cty);
//			con.setState(ste);
//			con.setCountry(ctr);
//			con.setPhone(phn);
			
			HttpSession ses = request.getSession(false);
			ses.setAttribute("contactinfo", con);
			response.sendRedirect("jsp/bankInfo.jsp");
			
		} else {
			request.setAttribute("errors", errMsg);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/contactInfo.jsp");
			rd.forward(request, response);
			
		}
		
		
	}


	private boolean isBlank(String value) {
		return value == null || value.trim().length() == 0;
	}

}
