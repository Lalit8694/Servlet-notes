package in.lalit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("sachin", "crickter");
		request.setAttribute("lalit", "developer");
		request.setAttribute("amar", "choudhary");
		
		RequestDispatcher rd =request.getRequestDispatcher("/test2");
		rd.forward(request, response);
	}

}
