package name;

public class PrimeSum {
	
	
	public boolean prime(int num) {
		int i, j, sum = 0; boolean flag = true;
		if(num <= 1) flag = false;
		else {
			for(j = 2; j < num; j++) {
				if(num%j == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		PrimeSum ps = new PrimeSum();
		for(i = 2; i < 101; i++) {
			int flag = 0; 
			for(j = 2; j < i; j++) {
				if(i%j == 0) {
//					System.out.println("Not Prime "+ i );
					flag++;
					break;
				}
			}
			if(flag == 0) {				
				System.out.print("This "+i+" is prime number. ");
//				sum += i;
				int num = i;
				int sum1 = 0;
				while(num>0) {
					int rem = num % 10;
					num /= 10;
					sum1 += rem;
					
				}
//				System.out.println(sum1);
				if(ps.prime(sum1)) {
					System.out.print("The sum of the digits is "+sum1+" also prime number.");
				}
				else {
					System.out.print("The sum of the digits is "+sum1+" not a prime number.");
				}
				System.out.println();
//				System.out.println();
//				System.out.println();
			}
		}

	}

}

/*
 		****** OUTPUT: ******
This 2 is prime number. The sum of the digits is 2 also prime number.
This 3 is prime number. The sum of the digits is 3 also prime number.
This 5 is prime number. The sum of the digits is 5 also prime number.
This 7 is prime number. The sum of the digits is 7 also prime number.
This 11 is prime number. The sum of the digits is 2 also prime number.
This 13 is prime number. The sum of the digits is 4 not a prime number.
This 17 is prime number. The sum of the digits is 8 not a prime number.
This 19 is prime number. The sum of the digits is 10 not a prime number.
This 23 is prime number. The sum of the digits is 5 also prime number.
This 29 is prime number. The sum of the digits is 11 also prime number.
This 31 is prime number. The sum of the digits is 4 not a prime number.
This 37 is prime number. The sum of the digits is 10 not a prime number.
This 41 is prime number. The sum of the digits is 5 also prime number.
This 43 is prime number. The sum of the digits is 7 also prime number.
This 47 is prime number. The sum of the digits is 11 also prime number.
This 53 is prime number. The sum of the digits is 8 not a prime number.
This 59 is prime number. The sum of the digits is 14 not a prime number.
This 61 is prime number. The sum of the digits is 7 also prime number.
This 67 is prime number. The sum of the digits is 13 also prime number.
This 71 is prime number. The sum of the digits is 8 not a prime number.
This 73 is prime number. The sum of the digits is 10 not a prime number.
This 79 is prime number. The sum of the digits is 16 not a prime number.
This 83 is prime number. The sum of the digits is 11 also prime number.
This 89 is prime number. The sum of the digits is 17 also prime number.
This 97 is prime number. The sum of the digits is 16 not a prime number.
 
*/