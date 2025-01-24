package com.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectioDB {
	// Database connection details
	static String url = "jdbc:mysql://localhost:3306/onlinebankig";
	static String username = "root";
	static String password = "262001";

	// Method to create a database connection
	public static Connection createConnection() {

		Connection con = null;
		try {
			// Attempt to establish a connection to the database
			con = DriverManager.getConnection(url, username, password);

			// Print success message if the connection is successful
			System.out.println("<-----* Connection Successfull to Database -----*>");
			System.out.println("");
		} catch (SQLException e) {
			// Print error message and stack trace in case of connection failure
			System.out.println("Connection Failed!");
			e.printStackTrace();
		}
		return con;
	}
}
