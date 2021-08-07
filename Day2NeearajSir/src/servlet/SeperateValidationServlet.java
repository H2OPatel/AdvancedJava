package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SeperateValidationServlet")
public class SeperateValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SeperateValidationServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String UserId = request.getParameter("UserId");
		String EmailId = request.getParameter("EmailId");
		String PhoneNumber = request.getParameter("PhoneNumber");
		
		RequestDispatcher rd = request.getRequestDispatcher("/CallValidationServlet");
		
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
