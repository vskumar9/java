package name;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		
		try
		{
			
			System.out.println("Driver Registred Sccessfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssrtic","root","");
			System.out.println("Databse Connection Extablished");
			
			String sql = "INSERT INTO product(name,price)values('Keyboard',850)";
			
			Statement st = con.createStatement();
			
			st.executeUpdate(sql);
			System.out.println("Record Inserted");
			
		}
		catch (SQLException e) {
			
				e.printStackTrace();
		}
		
		
	}

}
