package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ci2")
public class contactInfoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContactInfo contactinfo = new ContactInfo();
		String add = request.getParameter("Address");
		String cty = request.getParameter("City");
		String ste = request.getParameter("State");
		String ctr = request.getParameter("Country");
		int phn =Integer.parseInt(request.getParameter("Phone"));
		
		contactinfo.setAddress(add);
		contactinfo.setCity(cty);
		contactinfo.setState(ste);
		contactinfo.setCountry(ctr);
		contactinfo.setPhone(phn);
		
		HttpSession ses = request.getSession();
		ses.setAttribute("ContactInfo", contactinfo);
		response.sendRedirect("jsp/contactInfo2output.jsp");
		
	}

}
