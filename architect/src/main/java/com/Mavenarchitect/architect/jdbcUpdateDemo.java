package com.Mavenarchitect.architect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "Harini@26";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "UPDATE Student SET Course=?, Email=? WHERE Name=?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Physics");
			statement.setString(2, "bibin6420@gmail.com");
			statement.setString(3, "Bibin");
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("A new user was inserted successfully!");
			} else {
				System.out.println("No matching student found");

			}
		}

		catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
