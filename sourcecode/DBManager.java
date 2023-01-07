package lms_project;

import java.sql.*;



public class DBManager {
	
	public static Connection ConnectDatabase() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdb", "root","abhi4411");
			  System.out.println("Connection Established is success");
			return con;
			
		}
		
		catch(ClassNotFoundException e)
		{
		System.out.println("Connection error");	
		return null;
		}
		catch(SQLException e)
		{
		System.out.println("Sql related error");	
		return null;
		}
	}

}
