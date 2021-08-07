package com.as.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ws2")
public class welcome2Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1: Read The Input
		PersonInfo personalInfo = new PersonInfo();

		 String firstName = request.getParameter("fname");
		 String middleName =request.getParameter("mname");
		 String lastName =request.getParameter("lname");
		 personalInfo.setFirstname(firstName);
		 personalInfo.setMiddlename(middleName);
		 personalInfo.setLastname(lastName);

//    	personalInfo.setFirstname(request.getParameter("fname"));
//    	personalInfo.setMiddlename(request.getParameter("mname"));
//    	personalInfo.setLastname(request.getParameter("lname"));
    	
    	
    	//Step2: Processing
    	//2a:validation
		 String errorMsg = "";
		 if (isBlank(firstName)) {
			 errorMsg += "First Name can't be blank";
		 }
		 if (isBlank(lastName)) {
			 errorMsg += "Last Name can't be blank";
		 }
		 if (isBlank(middleName)) {
			 errorMsg += "Middle Name can't be blank";
		 }
		 
		 
    	//2b:DB Interaction
    	
    	//Step3: Response Back
		//if there are no errors send to the success page
		//else send the same page with errors 
    	//request, session, page, application
    	//till request, till session expire, till page alive, till server restart
		 
		 
		 
		 if (isBlank(errorMsg)) {
			 HttpSession ses = request.getSession();
			 ses.setAttribute("persondata", personalInfo);
			 
			 response.sendRedirect("jsp/welcome1output2.jsp");
		 }else {
			 
			 request.setAttribute("errors", errorMsg);
			 RequestDispatcher rd = request.getRequestDispatcher("jsp/welcomeValidation.jsp");
			 rd.forward(request, response);
		 }
    	
	}

	private boolean isBlank(String field) {
		return field == null || field.trim().length() == 0;
	}

}
