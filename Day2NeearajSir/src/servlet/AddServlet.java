package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public AddServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		int i =Integer.parseInt(request.getParameter("num1"));
		int j =Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		HttpSession s = request.getSession();
		s.setAttribute("x", k);
		
		response.sendRedirect("SqServlet");
		
	}

}
