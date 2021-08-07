package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.ContactInfo;
import dao.contactinfodao;


@WebServlet("/ci2")
public class contactInfoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String add = request.getParameter("Address");
		String cty = request.getParameter("City");
		String ste = request.getParameter("State");
		String ctr = request.getParameter("Country");
		int phn =Integer.parseInt(request.getParameter("Phone"));
		
		ContactInfo contactinfo = new ContactInfo(add,cty,ste,ctr,phn);
		contactinfodao cdao = new contactinfodao();
		cdao.insert(contactinfo);
		
//		contactinfo.setAddress(add);
//		contactinfo.setCity(cty);
//		contactinfo.setState(ste);
//		contactinfo.setCountry(ctr);
//		contactinfo.setPhone(phn);
//		
		HttpSession ses = request.getSession(false);
		ses.setAttribute("ContactInfo", contactinfo);
		response.sendRedirect("html/bankInfo1.html");
		
	}

}
