package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ws1")
public class welcome1Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1: Read The Input
		PersonInfo personalInfo = new PersonInfo();
		String firstName = request.getParameter("fname");
    	String middleName = request.getParameter("mname");
    	String lastName = request.getParameter("lname");
    	
    	
    	//Step2: Processing
    	//2a:validation
    	//2b:DB Interaction
    	
    	//Step3: Response Back
    	//request, session, page, application
    	
    	request.getSession().setAttribute("ofname", firstName);
    	request.getSession().setAttribute("omname", middleName);
    	request.getSession().setAttribute("olname", lastName);
    	
    	//PrintWriter out = response.getWriter();
    	response.sendRedirect("jsp/welcome1output.jsp");
	}

}
