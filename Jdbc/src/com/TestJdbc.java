package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Load the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		System.out.println("Connection is established");
		//Close The connection
		con.close();
	}

}
