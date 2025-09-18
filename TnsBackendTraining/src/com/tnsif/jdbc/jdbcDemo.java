package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {
	private static String USERNAME="postgres";
	private static String PASSWORD="*******";
	//private static String DBNAME="KPRIT";
	private static String URL="jdbc:postgresql://localhost:5432/*****";
	


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Step 1--> Loading the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		
//		Step 2--> Establishing the connection
		Connection con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println("Connection Established");
		
//		Step 3--> Creating statements
		Statement stmt =con.createStatement();
		String query = "select * from stud";
		
		String query2 = "insert into stud values(105,'Mahesh')";
		PreparedStatement pst = con.prepareStatement(query2);
		pst.execute();
		System.out.println("One new row added");

//		Step 4--> Executing the query 
		ResultSet rs = stmt.executeQuery(query);
		
//		Step 5--> Retrieving the data 
		while(rs.next()) {
			int sid = rs.getInt(1);
			String sname = rs.getString(2);
			
			System.out.println(sid+ " " +sname);
		}
	}

}
