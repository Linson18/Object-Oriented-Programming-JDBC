package com.lti.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcDemo {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection conn=null;
		
			conn = DriverManager.getConnection(url,"hr","hr");
		
		
		if(conn !=null)
		{
			System.out.println("connected");
		}
		
	}

}
