package servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LifeCycleServlet() {
        super();
        
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet is intialized here...");
	}

	
	public void destroy() {
		System.out.println("Servlet is destroyed...Do the code clean up here..");
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(LocalDateTime.now().toString());
	}

}
