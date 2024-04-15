package DB;


import java.sql.*;

public class DBConnection {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Driver Register successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techno","root","");
			System.out.println("Database connection is establish");
			
			String sql = "INSERT INTO sanjeev(Rno,Name,mobile) values(1, 'kumar', 9874563210)";
			
			
			Statement st = con.createStatement();
			
			st.executeUpdate(sql);
			
			System.out.println("Record inserted.");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
