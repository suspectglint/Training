package com.hsbc.grg;

import java.util.HashMap;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();

    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		hm.put(1,new Employee(1,"Rokkam",20000));
		hm.put(2,new Employee(2,"Sravan",30000));
		hm.put(3,new Employee(3,"Reddy",40000));
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String s = request.getParameter("empid");
		int i = Integer.parseInt(s);
		Employee e = hm.get(i);
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Employee Details Portal</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Employee Details Portal</h1>");
		pw.println("<h1>EmpID : "+i+"</h1><br><br>");
		if(e!=null)
		{
			pw.println("<h1>Name : "+e.getName()+"</h1><br><br>");
			pw.println("<h1>Salary : "+e.getSalary()+"</h1><br><br>");
		}
		pw.println("</body>");
		pw.println("</html>");		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
