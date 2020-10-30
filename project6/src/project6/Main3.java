package project6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import org.apache.derby.iapi.sql.PreparedStatement;

public class Main3 {

	public static void main(String[] args) throws SQLException {
		//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb");		
		int eid[] = {223,333,444,555};
		String nm[] = {"Sudhir","john","Abcd","Kumar"};
		float sl[] = {11000,11000,11000,11000};
		String dob[] = {"1999-01-01","1999-01-01","1999-01-01","1999-01-01"};
		String sql = "insert into employee values(?,?,?,?)";
		java.sql.PreparedStatement pst =con.prepareStatement(sql);
		for(int i=0;i<eid.length;i++)
		{
			((java.sql.PreparedStatement) pst).setInt(1,eid[i]);
			((java.sql.PreparedStatement) pst).setString(2,nm[i]);
			((java.sql.PreparedStatement) pst).setFloat(3,sl[i]);
			((java.sql.PreparedStatement) pst).setString(4,dob[i]);
			pst.executeUpdate();
		}

	}

}
