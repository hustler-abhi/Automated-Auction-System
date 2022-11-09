package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUTILL {
	
	public static Connection provideConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Auction_System","root", "Karma");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return con;
		
		
		
		
	}
	

}
