package BitMagic;

import java.util.Scanner;

public class CountNoOfBitsFlipped {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int noOfTestcases = sc.nextInt();
	  for(int i=0;i<noOfTestcases;i++) {
		  int n1 = sc.nextInt();
		  int n2 = sc.nextInt();
		  countNoOfBits(n1, n2);
	  }
	  
	}

	private static void countNoOfBits(int n1, int n2) {
		int n = n1^n2;
		int count =0;
		while(n != 0) {
			count += n&1;
			n >>=1;
		}
		System.out.println(count);
	}

}
