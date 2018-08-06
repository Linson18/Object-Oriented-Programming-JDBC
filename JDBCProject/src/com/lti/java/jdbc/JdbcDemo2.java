package com.lti.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		Connection conn = null;

		conn = DriverManager.getConnection(url, "hr", "hr");

		if (conn != null) {
			System.out.println("connected");
		}

		try {

			Statement stmt = conn.createStatement();
			int i= stmt.executeUpdate("insert into Products values (104,'Battery' , 700)");
			System.out.println(i+ "record inserted: ");
		

		} catch (Exception e) {
			System.out.println(e);
		}

		finally {

			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}


}
