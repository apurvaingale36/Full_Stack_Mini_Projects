package com.learnings.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.mysql.cj.xdevapi.PreparableStatement;
public class JDBC_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root")) {
			 System.out.println(connection);

			 System.out.println("Connection established successfully!");
			// connection.setAutoCommit(false);
			 Scanner sc=new Scanner(System.in);
			 
			 
			 while(true) {
				 System.out.println("Choose an operation ");
				 System.out.println("1) Insert ");
				 System.out.println("2) Update ");
				 System.out.println("3) Delete");
				 System.out.println("4) Retrieve & Display");

			 int cho=sc.nextInt();
			 switch(cho) {
			 case 1:
				 System.out.println("Enter emp ID: ");
				 int ID=sc.nextInt();
				 sc.nextLine();
				 System.out.println("Enter emp name: ");
				 String name=sc.nextLine();
				 
				 System.out.println("\nEnter emp phone number: ");
				 String number=sc.nextLine();
				 
				 System.out.println("Enter emp age: ");
				 int age=sc.nextInt();
				 sc.nextLine();
				 insertRecord(connection,ID,name,number,age);
				 break;
			 case 2:
				 System.out.println("Enter emp ID to be upadted: ");
				 ID=sc.nextInt();
				 
				 System.out.println("Enter new age:");
				 int n_age=sc.nextInt();
				 
				 System.out.println("Enter emp new phone number: ");
				 String new_number=sc.nextLine();
				 upadteRecord(connection,ID, n_age);

				 break;
			 case 3:
				 System.out.println("Enter emp ID of the record to delete: ");
				 int delete_rec =sc.nextInt();
				 deleteRecord(connection,delete_rec);
				 
				 break;
				 
			 case 4:
				 retrive_display(connection);
				 break;
			 
			 
			 case 5:
			 try {
			 connection.commit();
			 System.out.println("data committed successfully!");
			 }
			 catch(SQLException com) {
			connection.rollback();
			System.out.println("data roll backed successfully!");
			 }
			 
			 
			 finally {
				 connection.setAutoCommit(true);
			 }
			 System.out.println("Exit!");
			 connection.close();
			 System.exit(0);
			 
			 }
			 }
		}catch(SQLException sql) {
				 sql.printStackTrace();
			 }
			 }
		


	

	private static void upadteRecord(Connection connection, int ID, int n_age) throws SQLException {
		// TODO Auto-generated method stub
		String update="UPDATE emp SET age=? where ID=?";
		PreparedStatement pstmt=connection.prepareStatement(update);
		pstmt.setInt(1, n_age);
		pstmt.setInt(2, ID);
		pstmt.executeUpdate();
		System.out.println("Record updated successfully!");
		
	}

	private static void retrive_display(Connection connection ) throws SQLException {
		// TODO Auto-generated method stub
	
		String select_q="SELECT * FROM emp";
		PreparedStatement pstmt=connection.prepareStatement(select_q);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			int id=rs.getInt("ID");
			String name=rs.getString("name");
			int number=rs.getInt("number");
			int age=rs.getInt("age");
			
			System.out.println("ID: "+id+ " Name "+name+" Age "+age+" Number "+number);
		}
		
		
	}

	private static void insertRecord(Connection connection, int ID, String name, String number, int age) throws SQLException {
		// TODO Auto-generated method stub
		String insert="INSERT into emp(ID,name,number,age)values(?,?,?,?)";
		PreparedStatement pstmt=connection.prepareStatement(insert);
		pstmt.setInt(1,ID);
		pstmt.setString(2, name);
		pstmt.setString(3, number);
		pstmt.setInt(4, age);
		pstmt.execute();
	}

	private static void deleteRecord(Connection connection, int ID) throws SQLException {
		// TODO Auto-generated method stub
		String delete="DELETE from emp where ID=?";
		PreparedStatement pstmt=connection.prepareStatement(delete);
		pstmt.setInt(1,ID);
		pstmt.executeUpdate();
		System.out.println("Record deleted!");
	}

}
