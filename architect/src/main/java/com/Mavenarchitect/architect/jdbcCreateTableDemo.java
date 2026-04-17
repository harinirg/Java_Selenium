package com.Mavenarchitect.architect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class jdbcCreateTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Harini@26";
		try(Connection conn=DriverManager.getConnection(dbURL,username,password)){
			String sql="CREATE TABLE Student"+"(ID INT NOT NULL,"+
		            "Name VARCHAR(255),"+
					"Course VARCHAR(255),"+
		            "Email VARCHAR(255),"+
					"PRIMARY KEY(ID))";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Table created Successfully using PreparedStatement!");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
