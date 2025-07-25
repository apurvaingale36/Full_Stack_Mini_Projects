package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	
	private static Connection connection;
	
	public static Connection getConn() {
		
		try {
			synchronized (JDBC.class) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				if(connection==null) {
					connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root","Root");
				}
			}
		
		} catch (SQLException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}



	
}
