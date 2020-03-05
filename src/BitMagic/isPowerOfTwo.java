package BitMagic;

import java.util.Scanner;

public class isPowerOfTwo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int noOfTestcases = sc.nextInt();
		 for(int i=0;i<noOfTestcases;i++) {
			 long n=sc.nextLong();
			 isPowerOfTwo(n);
		 }

	}

	private static void isPowerOfTwo(long n) {
		if(n == 0) {
			System.out.println("NO");
		} else if((n&(n-1)) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
