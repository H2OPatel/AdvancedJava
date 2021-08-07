package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Test() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i =Integer.parseInt(request.getParameter("num1"));
		int j =Integer.parseInt(request.getParameter("num2")); 
		
		int k = i + j;

		request.setAttribute("x", k);
		RequestDispatcher rd = request.getRequestDispatcher("/TestForInc");
		PrintWriter out = response.getWriter();
		out.println("The sum of two number is : " + k);
		rd.include(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i =Integer.parseInt(request.getParameter("num1"));
		int j =Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		PrintWriter out = response.getWriter();
		
		out.println("The sum of two number is : " + k);
		
		
	}

}
