

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaymentGateway
 */
public class PaymentGateway extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentGateway() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String cardname = request.getParameter("cardname");
	String cardnumber = request.getParameter("cardnumber");
	String expiremonth = request.getParameter("expmonth");
	String cvv = request.getParameter("cvv");
	ValidateTheCardDeatils vcard = new ValidateTheCardDeatils();
	try {
		vcard.validateCardNumber(cardnumber);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		vcard.validateCVV(cvv);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  if((cardnumber!= null) &&  (cvv != null)){
	RequestDispatcher req = request.getRequestDispatcher("/Paymentconfirm.jsp");
		req.forward(request, response);
	  }else {
		  RequestDispatcher req = request.getRequestDispatcher("/cardvalidate.jsp");
			req.forward(request, response);
	  }
	}
	
	
	
	
	
	}

