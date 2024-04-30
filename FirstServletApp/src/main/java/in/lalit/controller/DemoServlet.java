package in.lalit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet implements Servlet {

       
	static {
		System.out.println("Servlet loading.........");
	}
    
    public DemoServlet() {
        super();
        System.out.println("Servlet Instantalization.....");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initalization.........");
	}

	
	public void destroy() {
		System.out.println("Server deinstantalization........");
	}

	
	


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Provid the service for the user ..");
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		 out.println("<html> <head><title> Output </title> </head>");
         out.println("<body>");
         out.println("<h1 style='color:red'> <marquee> Welcome to the servlet coding with lalit... </marquee>");
         out.println("</body");
         out.println("</html>");
		
         out.close();
	}

}
