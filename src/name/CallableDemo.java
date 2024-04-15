mport java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class CallableDemo {

	public static void main(String[] args) {
		
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb24","root","");)
		{
			System.out.println("Connection Established");
			
			CallableStatement cs = con.prepareCall("{CALL insertStudent(?,?,?)}");
			
			cs.setString(1, "Hari");
			cs.setString(2, "IT");
			cs.registerOutParameter(3, Types.INTEGER);
			
			cs.execute();
			
			int newId = cs.getInt(3);
			
			System.out.println("New Students Registered Successly\n ID is: "+newId);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
