package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.PersonInfo;
import daos.PersonInfoDao;
import utilities.ProjectUtilities;


@WebServlet("/ws")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//================================================READ==============================================================
		
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String middleName = request.getParameter("mname");
		

		
//================================================VALIDATION============================================================	
		String errorMsg ="";
		/*
		boolean flag1 = false;
		boolean flag2 = true;
		if(!flag1 && flag2) {
			System.out.println("Will this line get printed?");
		}
		*/
		if (ProjectUtilities.isBlank(firstName) || !ProjectUtilities.isValidName(firstName)) {
			errorMsg += "First Name can't be blank."+"First Name must start with a letter. It can"
					+ "	contain only letters, numbers, and Spaces, Hyphens (-),"
					+ "	Underscores (_).<br/>";
		}
		
		
		
		if (ProjectUtilities.isBlank(middleName) || !ProjectUtilities.isValidName(middleName)) {
			errorMsg += "Middle Name can't be blank."+"Middle Name must start with a letter. It can"
					+ "	contain only letters, numbers, and Spaces, Hyphens (-),"
					+ "	Underscores (_).<br/>";
		}
		
		if (ProjectUtilities.isBlank(lastName) || !ProjectUtilities.isValidName(lastName))  {
			errorMsg += "Last Name can't be blank."+"Last Name must start with a letter. It can"
					+ "	contain only letters, numbers, and Spaces, Hyphens (-),"
					+ "	Underscores (_).<br/>";
		}
		
//================================================RESPONSE==================================================================		
		
		if (isBlank(errorMsg)) {
			
			PersonInfo per = new PersonInfo(firstName,middleName,lastName);
//			per.setFirstname(firstName);
//			per.setLastname(lastName);
//			per.setMiddlename(middleName);
			PersonInfoDao pdao = new PersonInfoDao();
			pdao.insert(per);
			
			HttpSession ses = request.getSession(false);
			ses.setAttribute("persondata", per);
			response.sendRedirect("jsp/contactInfo.jsp");
		}
		else {
			request.setAttribute("errors", errorMsg);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/welcome.jsp");
			rd.forward(request, response);
		}
		
	}

	private boolean isBlank(String value) {
		return value == null || value.trim().length() == 0;
	}

}
