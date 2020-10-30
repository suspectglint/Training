package com.hsbc.grg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServletXML
 */
public class EmpServletXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServletXML() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		hm.put(1,new Employee(1,"Rokkam",20000));
		hm.put(2,new Employee(2,"Sravan",30000));
		hm.put(3,new Employee(3,"Reddy",40000));
	}
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s = request.getParameter("empid");
		int i = Integer.parseInt(s);
		Employee e = hm.get(i);
		PrintWriter pw = response.getWriter();
        //XML format
		/*		if(e!=null)
		{
			String opt = "<employee>";
			opt = opt+"<empid>"+i+"</empid>";
			opt = opt+"<name>"+e.getName()+"</name>";
			opt=opt+"<salary>"+e.getSalary()+"</salary";
			opt = opt+"</employee>";
			pw.println(opt);
		}*/
		//JSON format
		if(e!=null)
		{
			String opt = "{\"empid\":";
			opt=opt+e.getEmpID()+",\"name\":";
			opt=opt+"\""+e.getName()+"\""+",\"salary\":";
			opt=opt+e.getSalary()+"}";
			pw.println(opt);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
