package FlightManagement;

import java.sql.SQLException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Flight Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Flight Source: ");
		String source = sc.nextLine();
		System.out.print("Enter the Flight Destination: ");
		String Destination = sc.nextLine();
		System.out.print("Enter the Flight NoOfSeats: ");
		int noOfSeats = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Flight Fare: ");
		double fare = sc.nextDouble();
		sc.nextLine();
		
		Flight flight = new Flight(id, source, Destination, noOfSeats, fare);
		
		if(new FlightManagement().addFlight(flight)) System.out.println("Flight details added successfully.");
		else System.out.println("Flight details not added.");
		

	}

}
