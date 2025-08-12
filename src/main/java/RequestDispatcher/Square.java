package RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Square extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// get the data from the Addition Servelet
		int k = (int) req.getAttribute("k");
		
		// do the operation
		int result = k * k;
		
		// get the writer
		PrintWriter out = res.getWriter();		
		
		// print the message
		out.print("The Square of number is : " + result);
	}
	
}
