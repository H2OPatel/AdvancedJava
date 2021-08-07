package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class NewServlet extends HttpServlet {
	
       
   
    public NewServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i =Integer.parseInt(request.getParameter("num1"));
		int j =Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		PrintWriter out = response.getWriter();
		
		out.println("The sum of two number is : " + k);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
