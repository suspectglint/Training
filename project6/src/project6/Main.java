package project6;

import java.sql.*;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb");
		System.out.println("Connection successfully created");
		Statement st = con.createStatement();
		String query = "select empid,name,salary from employee";
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			int eid = rs.getInt(1);
			String nam = rs.getString(2);
			float sal = rs.getFloat(3);
			System.out.println(eid+"  "+nam+"  "+sal);
		}
	}

}
