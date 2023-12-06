package programs;
import java.util.*;

public class PrintTableGFG {
	
	public static void printTables(int number) {
		for(int i=1; i<11; i++) {
			System.out.print(number*i+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int number = new Scanner(System.in).nextInt();
		printTables(number);
	}
}
