package name;

import java.sql.*;
import java.io.*;
import java.util.*;

class DBconnection{
	
	private static Connection con = null;
	private static Properties prop = new Properties();

	public static void main(String[] args) {
		try {
			getConnection();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static Connection getConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		
		String database = "techno";
		String table = "sanjeev";
		
		try(
			FileInputStream file = new FileInputStream("src/DBProperties.properties");	
			){
			
			prop.load(file);
			Class.forName(prop.getProperty("DB_DRIVER_CLASS"));
			if(!databseExists(database)) {
				createDatabase(database);
				System.out.println("Create database");
			}
//			else {
//				System.out.println("already exists");				
//			}
			
			String dburl = prop.getProperty("DB_URL")+"/"+database; 
			Connection con = DriverManager.getConnection(dburl, prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));	
			
			if(!tableExists(con, table)) {
				createTable(con, table);
				System.out.println("create table");
			}
			else {
				System.out.println("already table is exists");
			}
			
			String sql = "INSERT INTO sanjeev(Rno, Name, mobile) values(10,'kumar',9874563210);";
			
			Statement state = con.createStatement();
			state.executeUpdate(sql);
			
			
		}
		
		return null;
		
	}
	
	private static boolean databseExists(String database) throws SQLException {
		
		try(
			Connection con = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));	
			){
			
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery("SHOW DATABASES LIKE '" + database + "'");
			return rs.next();
		}
	}
	
	private static void createDatabase(String database) throws SQLException {
		
		try(
				Connection con = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("DB_USERNAME"), prop.getProperty("DB_PASSWORD"));	
				){
				
				Statement state = con.createStatement();
				state.executeUpdate("CREATE DATABASE "+database);
			}
	}
	
	private static boolean tableExists(Connection con, String tableName) throws SQLException {
		DatabaseMetaData metaData = null;
		ResultSet rs = null;
		try {
				metaData = con.getMetaData();
				rs = metaData.getTables(null, null, tableName, null);
				boolean non = rs.next();
				System.out.println(non);
				return non;
				
		} finally{
			
			if(rs != null) {
				rs.close();
			}
			if(metaData != null) {
				
			}
			
		}
	}
	
	private static void createTable(Connection con, String tableName) throws SQLException {
		try(
				Statement state = con.createStatement();
			)
		{
			try {
				state.executeUpdate("CREATE TABLE "+tableName+"(Rno int, Name varchar(20), mobile bigint)");
			} catch(Exception e) {
				
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}