package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.BankInfo;
import utilities.ProjectUtilities;


@WebServlet("/bis")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//===================================================READ=======================================================================
		
		BankInfo ban = new BankInfo();
		String bName = request.getParameter("BankName");
		Integer aNum =null;
		Integer sNum = null;
		
		if (ProjectUtilities.isNumber(request.getParameter("AccountNumber"))) {
			aNum = Integer.parseInt(request.getParameter("AccountNumber"));
		}
		
		if (ProjectUtilities.isNumber(request.getParameter("Ssn"))) {
			sNum = Integer.parseInt(request.getParameter("Ssn"));
		}
	   
	    
	   
	    
//==================================================VALIDATION===================================================================
	    
	    String errorMsg ="";
	    
	    if (ProjectUtilities.isBlank(bName)) {
	    	errorMsg += "Bank Name Can't be Blank<br/>";
	    }
	    
	    if (aNum == null) {
	    	errorMsg += "Account Number Can't be Blank<br/>";
	    }
	    if (sNum == null || !ProjectUtilities.isValidSsn(request.getParameter("Ssn"))) {
	    	errorMsg += "SSN Number Can't be Blank<br/>"
	    				+"SSN Must Contain 8 digits.<br/>"
	    				+"Please enter a valid Number.<br/>";
	    }
		
//===================================================RESPONSE=====================================================================
	    
	    if (ProjectUtilities.isBlank(errorMsg)) {
	    	
	    	ban.setBankname(bName);
	 	    ban.setAccountnumber(aNum);
	 	    ban.setSsn(sNum);
	    	
	    	HttpSession ses = request.getSession(false);
	    	ses.setAttribute("bankinfo", ban);
	    	response.sendRedirect("jsp/output.jsp");
	    } else {
	    	
	    	request.setAttribute("errors", errorMsg);
	    	RequestDispatcher rd = request.getRequestDispatcher("jsp/bankInfo.jsp");
	    	rd.forward(request, response);
	    }
		
		
	}

}
