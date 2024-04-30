package in.request.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class ServletApp extends HttpServlet {
	
	
	static {
		System.out.println("Loaing.....");
	}
       
   
    public ServletApp() {
   System.out.println("Servlet initailzation");
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//taking  parameter of the register form
		String rname=request.getParameter("username"); // username is the name writter in register.html page
	    String rnumber =request.getParameter("number");
	    String remail= request.getParameter("email");
	    String[] rcourse=request.getParameterValues("course");
		
		PrintWriter out= response.getWriter();
		
		//3. Setting the HTML Page to write the response
		out.println("<html> <head> <title> OUTPUT </title> <head>");
		out.println("<body> ");
		 
		
		out.println("<table border=1px align='center' >");
		out.println("<tr> <th>NAME </th> <td>"+rname+"</td <tr>");
		out.println("<tr> <th>NUMBER </th> <td>"+rnumber+"</td <tr>");
		out.println("<tr> <th>EMAIL </th> <td>"+remail+"</td <tr>");
		
		
		out.println("<tr> <th> COURSE </th> <td>");
		for(String course:rcourse) {
			out.println(course+"</br>");
		}
		out.println("</td> <tr>");
		
		
		out.println("</table>");
		out.println("</body></html>");
	
		
		//4. Close the response object
		out.close();
}
	}


