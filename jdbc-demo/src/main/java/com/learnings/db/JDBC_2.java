package com.learnings.db;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;
public class JDBC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection connection = DriverManager

				.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root")) {

					

			//System.out.println("connection now established");

			Statement statement = connection.createStatement();

			

			ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");


			while(resultSet.next()) {

				System.out.println(resultSet.getInt(1) +"   "+ resultSet.getString(2));

			}

			

			

			

		} catch (SQLException e) {

			e.printStackTrace();

		
}

 
	}

}
