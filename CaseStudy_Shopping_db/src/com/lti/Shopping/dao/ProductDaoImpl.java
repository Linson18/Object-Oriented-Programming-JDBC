package com.lti.Shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.lti.Shopping.entity.Product;
import com.lti.Shopping.util.DbUtil1;

//actual method
public class ProductDaoImpl implements IProductDao {

	DbUtil1 util = null;

	PreparedStatement pstmt = null;
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public ProductDaoImpl() throws SQLException {
		util = new DbUtil1();

	}

	@Override
	public ArrayList<Product> getProductDetails() {
		// return null;
		ArrayList<Product> ProductList = new ArrayList<Product>();

		try {

			conn = util.getConnectionFromPool();// establish connection with db

			stmt = conn.createStatement();// intialize object of predefined Statement class
			rs = stmt.executeQuery("Select * from Products");

			while (rs.next()) {
				int id = rs.getInt("PrdID");
				String name = rs.getString("Prdname");
				float cost = rs.getFloat("Prdcost");
				System.out.println("\t" + id + "  " + name + "\t" + cost + "\n");
				Product p1 = new Product(id, name, cost);
				ProductList.add(p1);
			}
			return ProductList;
		} catch (Exception e) {
			System.out.println(e);
		}
		return ProductList;// returns complete arraylist
	}

	@Override
	public void addProduct(Product p) {
		// ArrayList<Product> ProductList = new ArrayList<Product>();

		try {

			conn = util.getConnectionFromPool();// establish connection with db

			pstmt = conn.prepareStatement("Insert into Products values(?,?,?)");

			pstmt.setInt(1, p.getProductId());
			pstmt.setString(2, p.getProductName());
			pstmt.setDouble(3, p.getPrice());
			pstmt.executeUpdate();
			System.out.println(" Record added ");

		}
		// return ProductList;
		catch (Exception e) {
			System.out.println(e);
		}
		// return ProductList;

	}

	@Override
	public void updateProduct(Product p1) {
		try {

			conn = util.getConnectionFromPool();// establish connection with db

			pstmt = conn.prepareStatement("Update Products set Prdcost = ? where PrdID = ?");
			pstmt.setDouble(1, p1.getPrice());
			pstmt.setInt(2, p1.getProductId());

			pstmt.executeUpdate();
			System.out.println("Record Updated ");

		}
		// return ProductList;
		catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void deleteProduct(Product p2) {
		try {

			conn = util.getConnectionFromPool();// establish connection with db

			pstmt = conn.prepareStatement("delete from Products where PrdID = ?");
			pstmt.setInt(1, p2.getProductId());

			pstmt.executeUpdate();
			System.out.println("Record deleted ");

		}
		// return ProductList;
		catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public ArrayList<Product> searchProduct(Product p) {
		ArrayList<Product> searchList = new ArrayList<Product>();
		try {
			conn = util.getConnectionFromPool();// establish connection with db
			String sql = "Select  * from Products where PrdID = " + p.getProductId() + " ";
			ResultSet rs = stmt.executeQuery(sql);
			

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				double prdcost = rs.getFloat(3);
				searchList.add(p);
				System.out.println("\t" + id + "  " + name + "\t" + prdcost + "\n");
			}
			 return searchList;
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		return searchList;

	}
}
