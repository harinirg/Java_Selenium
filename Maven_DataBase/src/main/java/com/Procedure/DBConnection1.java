package com.Procedure;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection1 {

	public static Connection getConnection() throws SQLException{	
	// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/testdb";
		String user="root";
		String password="Harini@26";
		return DriverManager.getConnection(url,user,password);

	}

}
