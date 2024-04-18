package FlightManagement;

import java.sql.*;

public class FlightManagement {

	
	public boolean addFlight(Flight flightobj) throws SQLException {
		int a = 0;
		try(
				Connection con = DB.getConnection();
				PreparedStatement st = con.prepareStatement("INSERT INTO booked VALUES(?, ?, ?, ?, ?)");
				
			){
			
			st.setInt(1, flightobj.getFlightId());
			st.setString(2, flightobj.getSource());
			st.setString(3, flightobj.getDestination());
			st.setInt(4, flightobj.getNoOfSeats());
			st.setDouble(5, flightobj.getFlightFare());
			
			a = st.executeUpdate();
		}
		
		return a>=1 ? true:false;
		
	}
	
	
}
