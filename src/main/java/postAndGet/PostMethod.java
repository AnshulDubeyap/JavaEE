package postAndGet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Make this Class a Servelet
public class PostMethod extends HttpServlet {
	
	// Whenever to get data from server use GET
	// Whenever to send data to server use POST

	
	// Inside the Servelet there is a service method
	// But What if i dont want to use get method in my Class at all, it their a way to create a service that can only accept the post method?
	// --> Yes, dopost() and doGet(), just replace service with dopost or doGet()
	
	
	public void doPost(HttpServletRequest req,  HttpServletResponse res) throws IOException {
		
		// get the data from url
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		// add it
		int k = i + j;
		
		System.out.print(k);
		
		// send the result
		PrintWriter out = res.getWriter();
			
		out.print("The output is : " + k);
	}
	
}
