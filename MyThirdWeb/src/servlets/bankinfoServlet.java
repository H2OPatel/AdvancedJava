package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/bsi1")
public class bankinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bName = request.getParameter("BankName");
		int aNum =Integer.parseInt(request.getParameter("AccountNumber"));
		int sNum =Integer.parseInt(request.getParameter("Ssn"));
		
		HttpSession ses = request.getSession();
		ses.setAttribute("bname", bName);
		ses.setAttribute("anum", aNum);
		ses.setAttribute("snum", sNum);
		
		response.sendRedirect("jsp/bankinfo1output.jsp");
	}

}
