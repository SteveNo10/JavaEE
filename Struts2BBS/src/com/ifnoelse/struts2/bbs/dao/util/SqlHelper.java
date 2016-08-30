package com.ifnoelse.struts2.bbs.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlHelper {
	private static String url = "jdbc:mysql://192.168.136.128:3306/Struts2BBS";
	private static String username = "root";
	private static String password = "abc123!!";
	
	
	public static Connection Connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		catch (Exception ex) {
			System.out.println("Connection Failed!" + ex.getMessage());
			return conn;
		}
	}

	public static ResultSet query(PreparedStatement preparedStatement) {
		ResultSet rs = null;
		try {
			rs = preparedStatement.executeQuery();
			return rs;
		}
		catch (Exception ex) {
			System.out.println("query Failed!" + ex.getMessage());
			return rs;
		}
	}
	
	public static int executeUpdate(PreparedStatement preparedStatement) {
		try {
			return preparedStatement.executeUpdate();
		}
		catch (Exception ex) {
			System.out.println("executeUpdate Failed!" + ex.getMessage());
			return 0;
		}
	}
	
}
