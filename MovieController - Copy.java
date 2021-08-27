
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MovieController
 */
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String str =request.getParameter("name");
		request.setAttribute("str2", str);
		RequestDispatcher rd = request
				.getRequestDispatcher("/Paymentgateway.jsp");
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<MovieDetails> list = new ArrayList<MovieDetails>();
		MovieDetails md = new MovieDetails();
		md.setMovieName("Mile 22");
		md.setMovieDirector("Peter Berg");
		md.setMovieDuration(3);
		md.setMovieType("action thriller");
		md.setMovieRating(8);
		list.add(md);
		MovieDetails md1 = new MovieDetails();
		md1.setMovieName("Hunter Killer");
		md1.setMovieDirector(" Donovan Marsh");
		md1.setMovieDuration(3);
		md1.setMovieType("Suspence thriller");
		md1.setMovieRating(9);
		list.add(md1);
		MovieDetails md2 = new MovieDetails();
		md2.setMovieName("The Gentlemen");
		md2.setMovieDirector("Guy Ritchie");
		md2.setMovieDuration(3);
		md2.setMovieType("Action");
		md2.setMovieRating(9);
		list.add(md2);
		request.setAttribute("list", list);
		MovieDetails md3 = new MovieDetails();
		md3.setMovieName("The Invisible Man");
		md3.setMovieDirector("Leigh Whannell");
		md3.setMovieDuration(3);
		md3.setMovieType("Thriller");
		md3.setMovieRating(8);
		list.add(md3);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("/MoviesList.jsp");
		rd.forward(request, response);
	}

}
