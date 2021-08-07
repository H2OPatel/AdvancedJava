package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserFormServletWithValidation")
public class UserFormServletWithValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserFormServletWithValidation() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String UserId = request.getParameter("UserId");
		String EmailId = request.getParameter("EmailId");
		String PhoneNumber = request.getParameter("PhoneNumber");

		if (UserId.isEmpty() || EmailId.isEmpty() || PhoneNumber.length() != 10) {
			response.getWriter().append("<h1>The data you entered is incorrect....<br><br></h1>");
		} else {
			response.getWriter().append("<h1>The data is fine....<br><br></h1>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
