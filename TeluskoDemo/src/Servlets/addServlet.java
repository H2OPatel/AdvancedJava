package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addServlet extends HttpServlet {
	
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i + j;
			
			HttpSession s = req.getSession();
			s.setAttribute("x", k);
			
			res.sendRedirect("/TestForInc");
			
//			PrintWriter out = res.getWriter();
//			out.println("The sum of two number is : "+k);
			
		}

}
