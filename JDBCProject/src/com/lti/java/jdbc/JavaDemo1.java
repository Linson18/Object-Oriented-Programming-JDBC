package com.lti.java.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaDemo1 {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		Connection conn = null;

		conn = DriverManager.getConnection(url, "hr", "hr");

		if (conn != null) {
			System.out.println("connected");
		}

		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Products");
			System.out.println("\t" + "id" + "  " + "name" + "\t" + "cost" + "\n");
			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				float cost = rs.getFloat(3);
				System.out.println("\t" + id + "  " + name + "\t" + cost + "\n");

			}

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
