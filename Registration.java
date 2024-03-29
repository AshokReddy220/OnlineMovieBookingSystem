
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;

	/**
	 * Default constructor.
	 */
	public Registration() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty()
				|| password.isEmpty() || address.isEmpty() || contact.isEmpty()) {
			RequestDispatcher req = request
					.getRequestDispatcher("Register1.jsp");
			req.include(request, response);
		} else {
			RequestDispatcher req = request
					.getRequestDispatcher("Register2.jsp");
			req.forward(request, response);
		}
	}

}
