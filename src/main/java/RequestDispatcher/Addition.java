package RequestDispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	
	// Now, Can I call a servelet from inside another Servelet, let's say i have two servelet add and square and i want to combine them
	// --> Yes, Possible using two methods, 1. RequestDispatcher  2. Redirect
	
	// Request Dispatcher, the req and res object are forwarded to next servelet, then same response object is sent back with result to the client (client doen't know who sends the reponse)
	// Now, the requestDispatcher works fine when two servelets works on same website/application, but what if let's say I require another servelet for payment sevice from paypal website
	// in this case the client has to know where the service of payment comming from, thus we use Redirect also in place of request dispatcher
	
	// in sendRedirect the servelet will tell he client that you are redirected to another servelet, thus their will be two response and request objects
	
	// service
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		// bundel the data with req object
		req.setAttribute("k", k); // (key and value)
		
		// Now use the Request Dispatcher, (send the req object + data, and the response obj)
		
		RequestDispatcher rd = req.getRequestDispatcher("/sq"); // dispatch request to Servelet at route "/sq" in the xml mapping
		
		// send the request and response object
		
		rd.forward(req, res);
	
		
	}
	

}
