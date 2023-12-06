package programs;
import java.util.*;

public class PatternsGFG {
	
	public static void pattern(int number) {
		for(int i = number; i>=1; i--) {
			for(int j = number; j>0; j--) {
				for(int k = i ; k>0; k--) {
					System.out.print(j);
				}
//				break;
			}
			System.out.print(" $");
		}
	}
	
	public static void main(String[] args) {
		int number = new Scanner(System.in).nextInt();
		pattern(number);
	}
}
