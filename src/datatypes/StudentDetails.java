package datatypes;

import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Students Details as a Description: ");
		
		System.out.print("Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Student rollNo: ");
		int roll  = sc.nextInt();
		
		System.out.print("student Weight: ");
		double weight = sc.nextDouble();
		
		System.out.print("All Clear: ");
		boolean clear = sc.nextBoolean();
		
		System.out.print("Student Gender: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("Student name: "+name+"\nrollNo: "+roll+"\nWeight: "+weight+"\nAll Clear : "+
		clear+"\ngender: "+gender);
		

	}

}
