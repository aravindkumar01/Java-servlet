package com.itMange.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	
	public static Connection getSqlConnection() throws Exception
	{
		
//		
		Class.forName("com.mysql.jdbc.Driver");
		
		return 	DriverManager.getConnection("jdbc:mysql://localhost:3306/itmanagement", "root", "");
		
	}
	
	

}
