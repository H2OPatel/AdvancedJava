package servlets;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyPracticeServlet
 */
@WebServlet("/MyPracticeServlet")
public class MyPracticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyPracticeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\16309\\OneDrive\\Desktop\\servletTest\\output.txt"));
		String userName = request.getParameter("username");
		String pwd = request.getParameter("password");
		String emailId = request.getParameter("email");
		String phoneNumber = request.getParameter("phone");
		bw.write(userName);
		bw.write(pwd);
		bw.write(emailId);
		bw.write(phoneNumber);
		
		bw.close();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
