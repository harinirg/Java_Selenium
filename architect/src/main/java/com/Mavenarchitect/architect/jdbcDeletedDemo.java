package com.Mavenarchitect.architect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDeletedDemo {
	public static void main(String args[]) {
	String dbURL = "jdbc:mysql://localhost:3306/testdb";
	String username = "root";
	String password = "Harini@26";
	try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		String sql = "DELETE FROM Student WHERE Name=?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "Bibin");
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("A new user was Deleted successfully!");
		} else {
			System.out.println("No matching student found");

		}
	}

	catch (SQLException ex) {
		ex.printStackTrace();
	}

}
}
