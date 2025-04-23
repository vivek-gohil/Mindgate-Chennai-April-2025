package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {

	public static void main(String[] args) {
		System.out.println("main start");
		// database location - ip address
		String url = "jdbc:oracle:thin:@172.27.12.79:1521:xe";
		// Username and password
		String user = "training";
		String password = "training";
		// Driver class name
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection connection = null;

		try {
			Class.forName(driver);
			System.out.println("Driver loaded");

			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				System.out.println("Connection successfull");
			} else {
				System.out.println("Connection failed");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load driver class");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("Connection closed");
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		System.out.println("main end");
	}
}
