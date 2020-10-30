package project6;

import java.util.*;
import java.sql.*;

public class Main4 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb");
        while(true)
        {
        	System.out.println("Enter the empid");
        	int empid = sc.nextInt();
        	if(empid!=0)
        	{
        		System.out.println("Enter name");
        		String name = sc.next();
        		System.out.println("Enter Salary");
        		float sal = sc.nextFloat();
        		System.out.println("Enter DOB");
        		String dob = sc.next();
        		String sql = "insert into employee values(?,?,?,?)";
        		java.sql.PreparedStatement pst =con.prepareStatement(sql);
        		((java.sql.PreparedStatement) pst).setInt(1,empid);
    			((java.sql.PreparedStatement) pst).setString(2,name);
    			((java.sql.PreparedStatement) pst).setFloat(3,sal);
    			((java.sql.PreparedStatement) pst).setString(4,dob);
    			pst.executeUpdate();       		
        	}
        	else
        		break;
        }
        sc.close();
        con.close();
	}

}
