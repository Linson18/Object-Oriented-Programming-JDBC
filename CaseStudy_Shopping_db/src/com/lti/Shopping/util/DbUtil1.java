package com.lti.Shopping.util;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;
//changes made only once
public class DbUtil1 {
	
	private OracleDataSource dataSource;
	public DbUtil1() throws SQLException {
		
		dataSource = new OracleDataSource();
		String driverType ="thin";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "hr";
		String password = "hr";
		
		dataSource.setDriverType(driverType);
		dataSource.setURL(url);
		dataSource.setUser(userName);
		dataSource.setPassword(password);
	}
	
	public Connection getConnectionFromPool() throws SQLException {//user method
		return dataSource.getConnection();//get connection establishes connection and returns it to object dataSource
	}
}
