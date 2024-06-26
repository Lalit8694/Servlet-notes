package in.lalit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class DemoServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("servlet is loading");
	}
	public DemoServletApp() {
		System.out.println("servlet is instatitaion");
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context= getServletContext(); //creating servlet object
		
		//attribute dynamic data
		context.setAttribute("google", "SundarPachai");
		context.setAttribute("microsoft", "billgates");
		context.setAttribute("lenove", "lalit");
		
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		out.println("<html><head><title>ServletContext</title></head><body>");
		out.println("<table align='center' border='1' ><th>ParameterName</th><th>ParameterValue</th>");
		Enumeration<String> parameterNames= context.getInitParameterNames();
		//paramter using static data
		while(parameterNames.hasMoreElements()) {
			String parameterName=(String) parameterNames.nextElement();
			String parameterValue=context.getInitParameter(parameterName);
			
			out.println("<tr><td>"+parameterName+"</td><td>"+parameterValue+"</td><tr>");
			
		}
		
		// for attribute dynamic data
		out.println("<html><head><title>ServletContext</title></head><body>");
		out.println("<table align='center' border='1' ><th>AttributeName</th><th>AttributeValue</th>");
		Enumeration<String> attributeNames= context.getAttributeNames();
		//paramter using static data
		while(attributeNames.hasMoreElements()) {
			String attributeName=(String) attributeNames.nextElement();
			Object attributeValue=context.getAttribute(attributeName);
			
			out.println("<tr><td>"+attributeName+"</td><td>"+attributeValue+"</td><tr>");
			
		}
		
		
		
		out.println("</body></html>");
		
		out.close();
		
		
	}

}
