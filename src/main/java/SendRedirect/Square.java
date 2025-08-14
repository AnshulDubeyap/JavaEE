package SendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// get the data from the Addition Servelet using get Parameter
		int k = Integer.parseInt(req.getParameter("k"));
		
		// get the luckyNo from session
		HttpSession session = req.getSession();
		int result2 = (int) session.getAttribute("num");
		
		// get the name from Cookie
		// use Array because the getCookie methods returns array of cookies
		Cookie cookies[] = req.getCookies();
		
		String result3 = "";
		
		// find our cookie
		for(Cookie C : cookies) {
			if(C.getName().equals("name")) {
			   result3 = result3 + C.getValue();
			}
		}
		
		
		 
		
		// do the operation
		int result = k * k;
		
		// get the writer
		PrintWriter out = res.getWriter();		
		
		// print the message
		out.println("The Square of number is : " + result);
		
		out.println("The  data from session is : " + result2);
		
		out.println("The  data from cookie is : " + result3);
		
		
	}

}
