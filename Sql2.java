package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql2 {

	public static void main(String[] args) throws SQLException {
		
		// create connection
		
		String url ="jdbc:mysql://localhost:3306/testdb";
		String user ="root";
		String password ="Sonask";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("database connected successfully");
	
		
			String query ="INSERT INTO emp1(empcode,empname,empage,esalary)VALUES (?, ?, ?, ?)";
		
			PreparedStatement ps= con.prepareStatement(query);
		
			ps.setInt(1,101);
			ps.setString(2,"Jenny");
			ps.setInt(3,25);
			ps.setDouble(4,10000);
			ps.executeUpdate();
			
			ps.setInt(1, 102);
			ps.setString(2,"jacky");
			ps.setInt(3, 30);
			ps.setDouble(4, 20000);
			ps.executeUpdate();
			
			ps.setInt(1, 103);
			ps.setString(2,"joe");
			ps.setInt(3, 20);
			ps.setDouble(4, 40000);
			ps.executeUpdate();
			
			ps.setInt(1, 104);
			ps.setString(2,"john");
			ps.setInt(3, 40);
			ps.setDouble(4, 80000);
			ps.executeUpdate();
			
			ps.setInt(1, 105);
			ps.setString(2,"shameer");
			ps.setInt(3, 25);
			ps.setDouble(4, 90000);
			ps.executeUpdate();
			System.out.println("reached here before success message");
			
			System.out.println("Data inserted successfully");
			
			con.close();
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
	}

}
		
	






