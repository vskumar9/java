package programs;
import java.util.*;

public class SeriesGpGFG {
	
	public static void seriesGp(int firstVal, int ratio, int position) {
		System.out.println((int)(firstVal*(Math.pow(ratio, position-1))));
	}
	
	
	public static void main(String[] args) {
		int firstVal = new Scanner(System.in).nextInt();
		int ratio = new Scanner(System.in).nextInt();
		int position = new Scanner(System.in).nextInt();
		
		seriesGp(firstVal, ratio, position);
	}

}
/*

The general form of terms of a GP is a, ar, ar2, ar3, and so on. Here, a is the first term and r is the common ratio.
The nth term of a GP is Tn = arn-1
Common ratio = r = Tn/ Tn-1
The formula to calculate the sum of the first n terms of a GP is given by:
Sn = a[(rn – 1)/(r – 1)] if r ≠ 1and r > 1
Sn = a[(1 – rn)/(1 – r)] if r ≠ 1 and r < 1
The nth term from the end of the GP with the last term l and common ratio r = l/ [r(n – 1)].
The sum of infinite, i.e. the sum of a GP with infinite terms is S∞= a/(1 – r) such that 0 < r < 1.
If three quantities are in GP, then the middle one is called the geometric mean of the other two terms. 
If a, b and c are three quantities in GP, then and b is the geometric mean of a and c. This can be written as b2 = ac or b =√ac
Suppose a and r be the first term and common ratio respectively of a finite GP with n terms. Thus, the kth term from the end of the GP will be = arn-k.


Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.

Note: As the answer can be rather large print its modulo 1000000007 (109 + 7).

Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is 
2, 4, 8, 16, 32,... in which 16 
is th 4th term.
Example 2:

Input: A = 4, R = 3, N = 3
Output: 36
Explanation: The GP series is
4, 12, 36, 108,.. in which 36 is
the 3rd term.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function Nth_term() which takes A, R and N as input parameter ans returns Nth term of the GP series modulo 109 + 7.
 

Expected Time Complexity: O(log2(N))
Expected Space Complexity: O(1)

Constraints:
1 <= A, R, N <= 1000000






*/