package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ValidationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String UserId = request.getParameter("UserId");
		String EmailId = request.getParameter("EmailId");
		String PhoneNumber = request.getParameter("PhoneNumber");

		response.getWriter().print("<h1> My Details </h1>");
		response.getWriter().print("<h2 style=\"color: blue ; font-family: serif ; font-style: italic\">" + UserId
				+ "====" + EmailId + "====" + PhoneNumber + "</h2>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String UserId = request.getParameter("UserId");
		String EmailId = request.getParameter("EmailId");
		String PhoneNumber = request.getParameter("PhoneNumber");

		response.getWriter().print("<h1> My Details From Post </h1>");
		response.getWriter().print("<h2 style=\"color: blue ; font-family: serif ; font-style: italic\">" + UserId
				+ "====" + EmailId + "====" + PhoneNumber + "</h2>");

		
		
	}

}
