package ServeletAnnotationConfiguration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/anno")
public class Addition extends HttpServlet {
	
	// We use annotations instead of configuring the xml file for every newly created servelet 
	// this is eaiser and more faster
	

	// service
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		// bundel the data with req object
		req.setAttribute("k", k);
		

		RequestDispatcher rd = req.getRequestDispatcher("/square"); // dispatch request to Servelet at route "/sq" in the xml mapping
		
		// send the request and response object
		
		rd.forward(req, res);
	
		
	}
	

}
