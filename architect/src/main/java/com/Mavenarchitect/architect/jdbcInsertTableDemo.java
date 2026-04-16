package com.Mavenarchitect.architect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcInsertTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "Harini@26";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			String sql = "INSERT INTO Student(Id,Name,Course,Email) VALUES (?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 101);
			statement.setString(2, "Bibin");
			statement.setString(3, "Maths");
			statement.setString(4, "bibin@gmail.com");
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

		}

		catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
