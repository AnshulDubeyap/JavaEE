package FirstServelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Extend the HttpServelet to make your class a Servelet 

public class AddServelet extends HttpServlet{
	
	// You can use service method in servelet to give the class a functionality
	
	public void service(HttpServletRequest req,  HttpServletResponse res) throws IOException {
		// How the User will send data to the servelet to add two numbers?
		// --> we use request object and response object, (we don't have to mention new here, the object will be created by Tom-cat, we just need a reference
		// --> to the the data through the url of (/add), we use req.getParameter()
		
		int i = Integer.parseInt(req.getParameter("num1")); // by default getParameter returns a string, so we have to convert it in integer
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		System.out.print(k);
		
		// How will servelet send the response to the User ?
		// --> res.getWriter().println()
		
		// getWriter() returns an object of printWriter
		PrintWriter out = res.getWriter();
		
		// Step-2 --> Configure the xml with Servelet anme and url
		
		out.print("The output is : " + k);

	
		
	}
	

}
