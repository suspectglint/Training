package com.hsbc.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet object created");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet object destroyed");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("client");
		String details = request.getParameter("about");		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Welcome Page!</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Welcome"+name+"</h1>");
		pw.println("Here are detals about you :<br>");
		pw.println(details);
		pw.println("</body>");
		pw.println("</html>");
		
	}

}
