package com.lti.java.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo3 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		Connection conn = null;

		conn = DriverManager.getConnection(url, "hr", "hr");

		PreparedStatement pstmt = null;
		if (conn != null) {
			System.out.println("connected");
		}

		try {
			/*
			 * int i = pstmt.executeUpdate();
			 * pstmt = conn.prepareStatement("Insert into Products values(?,?,?)");
			 * System.out.println("Insert values of Product- id , name , cost"); 
			 * Scanner sc=new Scanner(System.in); 
			 * pstmt.setInt(1,sc.nextInt()); 
			 * pstmt.setString(2,sc.next()); 
			 * pstmt.setFloat(3, sc.nextFloat()); 
			 * System.out.println(i+"record added");
			
			 */

			/*
			 * pstmt.setInt(1,106);
			 *  pstmt.setString(2, "cover");
			 *  pstmt.setFloat(3, 100);
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter product id and cost ");

			int id = sc.nextInt();
			float prdcost = sc.nextFloat();
			pstmt = conn.prepareStatement("Update Products set Prdcost = ? where PrdID = ?");
			pstmt.setInt(2, id);
			pstmt.setFloat(1, prdcost);
			

			pstmt.executeUpdate();
			System.out.println("Record updated" );

			//System.out.println("c1");
			Statement s = conn.createStatement();
			String sql = "Select  * from Products where PrdID = " + id + " ";

			
			ResultSet rs = s.executeQuery(sql);

			
			while (rs.next()) {
 
				id = rs.getInt(1);
				String name = rs.getString(2);
				prdcost = rs.getFloat(3);

				System.out.println("\t" + id + "  " + name + "\t" + prdcost + "\n");

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
