package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/bsi2")
public class bankinfoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("servlet has been called..");
		BankInfo bInfo = new BankInfo();
		String bName = request.getParameter("BankName");
		int aNum =Integer.parseInt(request.getParameter("AccountNumber"));
		int sNum =Integer.parseInt(request.getParameter("Ssn"));
		
		bInfo.setBankname(bName);
		bInfo.setAccountnumber(aNum);
		bInfo.setSsn(sNum);
		
		HttpSession ses = request.getSession();
		ses.setAttribute("bankInfo", bInfo);
		response.sendRedirect("jsp/bankinfo2output.jsp");
		
	}

}
