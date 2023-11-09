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

