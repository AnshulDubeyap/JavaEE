package postAndGet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetMethod extends HttpServlet {
	
	// Whenever to get data from server use GET
	// URL of GET --> http://localhost:8081/DemoApp/addition1?num1=12&num2=23
	
	// Whenever to send data to server use POST
	// URL of POST --> http://localhost:8081/DemoApp/addition2
	
	// As we see, the URL of GET method has data (query parameters),
	// but URL of POST method does not show data (it is sent in request body)
	// Both methods will give the same result of addition

	// Inside the Servlet there is a service method
	
	public void service(HttpServletRequest req,  HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		System.out.print(k);
		
		PrintWriter out = res.getWriter();
			
		out.print("The output is : " + k);
	}
	
}
