package com.cabbookingapp.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Connection connection;

	private ConnectionUtil() {

	}

	public static Connection getConnection() throws IOException, SQLException {
		Properties properties = new Properties();
		FileReader file = new FileReader(
				"C:\\Users\\ELCOT\\eclipse-workspace\\cab-booking-app\\src\\main\\resources\\application.properties");
		properties.load(file);
		String user = properties.getProperty("username");
		String url = properties.getProperty("url");
		String password = "";
		if (connection == null) {
			connection = DriverManager.getConnection(url, user, password);
		}
		return connection;
	}
}
