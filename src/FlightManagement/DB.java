package FlightManagement;

import java.sql.*;
import java.io.*;
import java.util.*;

public class DB {
	
	private static Connection con = null;
	private static Properties prop = new Properties();
	
	public static Connection getConnection() {
		
		try{
			FileInputStream file = new FileInputStream("src/DBProperties.properties");
			prop.load(file);
			
			Class.forName(prop.getProperty("DB_DRIVER_CLASS"));
			
			con = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));
			
		}
		catch(Exception e) {
			
		}
		
		return con;
		
	}

}
