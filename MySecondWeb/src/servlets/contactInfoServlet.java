package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ci1")
public class contactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = request.getParameter("Address");
		String city = request.getParameter("City");
		String state = request.getParameter("State");
		String country = request.getParameter("Country");
		int phone =Integer.parseInt(request.getParameter("Phone"));
		
		
		HttpSession ses = request.getSession();
		
		ses.setAttribute("add", address);
		ses.setAttribute("cty", city);
		ses.setAttribute("ste", state);
		ses.setAttribute("ctr", country);
		ses.setAttribute("phn", phone);
		
		response.sendRedirect("jsp/contactInfo1output.jsp");
		
	}

}
