package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.PersonInfo;
import dao.welcome1dao;


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
		 
		 welcome1dao wdao = new welcome1dao();
		 String result = wdao.insert(personalInfo);
		 response.getWriter().println(result);

//    	personalInfo.setFirstname(request.getParameter("fname"));
//    	personalInfo.setMiddlename(request.getParameter("mname"));
//    	personalInfo.setLastname(request.getParameter("lname"));
    	
    	
    	//Step2: Processing
    	//2a:validation
    	//2b:DB Interaction
    	
    	//Step3: Response Back
    	//request, session, page, application
    	//till request, till session expire, till page alive, till server restart
    	HttpSession ses = request.getSession(true);
    	ses.setAttribute("persondata", personalInfo);
    	response.sendRedirect("html/contactInfo.html");
	}

}
