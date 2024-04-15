package name;

import java.util.Scanner;
//Program to demonstrate filter the prime numbers from the list of user input.
  //( criteria is:  prime number = sum of prime number)
public class PrimeEx {
	
	//this method return true if the given parameter is prime otherwise return false
	static boolean isPrime(int n)
	{
	
		int count=0;
		for(int j=2;j<=n;j++)
		{
			if(n%j==0)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			return true;
		}
		
		return false;
	}
	
	//Main Method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		if(!(size>=1 && size<=5))
		{
			System.out.println("is an invalid array size");
			return;
		}
		
		int[] num = new int[size];
		
		System.out.println("Enter numbers");
		//get user input for num array
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<num.length;i++)
		{
				
			//checking each array value is prime or not
			if(isPrime(num[i]))
			{
				
				int sum=0;
				
				int n = num[i];
				
				//find the sum of prime number till n
				
				for(int j=2;j<n;j++)
				{
					
					if(isPrime(j))
					{
						sum+=j;
						
					}
					if(sum>=n)
					{
						break;
					}
					
				}
				
				//print n if its equal with sum
				if(sum==n)
				{
					System.out.println(n);
				}
				
			}
			
			
		}

	}

}
