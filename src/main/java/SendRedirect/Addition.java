package SendRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition extends HttpServlet {
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
		// Since we are not forwarding the request, we will use other ways to send data to another Servlet
		// --> urlRewriting is a method in session management that lets us send data from one servlet to another through the URL
		// --> sessionWriting is a method that allows sharing data across multiple servlets by storing it in a session and later retrieving it
		// --> Cookie is a method that sends a small piece of data (token) along with every request made by the client
		
		
		// 2. SessionWriting 
		
				int luckyNo = 667;
				HttpSession session = req.getSession();
				session.setAttribute("num", luckyNo);
				
				// 3. Cookie
				
				String name = "Anshul_Dubey";
				Cookie cookie = new Cookie("name", name);
				res.addCookie(cookie);

		
		// 1. URL Rewriting
		// In urlRewriting, we manually add data in the URL, and the next servlet reads it from the URL parameters
		
		// Use sendRedirect and urlRewriting 
		res.sendRedirect("sqr?k=" + k);
		
		
		
	}

}
