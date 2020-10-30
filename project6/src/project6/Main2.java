package project6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb");
		System.out.println("Connection successfully created");
		Statement st = con.createStatement();
		String query = "insert into employee values(145,'Siva Sai',116000,'1998-07-03')";
		st.executeUpdate(query);
		query = "update employee set salary=125000 where empid=125";
		st.executeUpdate(query);
		/*while(rs.next())
		{
			int eid = rs.getInt(1);
			String nam = rs.getString(2);
			float sal = rs.getFloat(3);
			System.out.println(eid+"  "+nam+"  "+sal);
		}*/
	}	
	
}
