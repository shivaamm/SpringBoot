package com.org.tav.day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class bank {
	static Connection c; // Global Connection Object
    public static Connection getConnection(Connection c) {
    	
		return c;
	}

public static void main(String[] args) {
// TODO Auto-generated method stub
	Connection con = null;
	Statement stmt = null;
	
	try {
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank","postgres", "110037");
			System.out.println("Opened database successfully");
			
			stmt = con.createStatement();
			String sql = "";
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
			con=c;
		} 
		catch ( Exception e ) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table created successfully");
		
	}
//	return con;

}