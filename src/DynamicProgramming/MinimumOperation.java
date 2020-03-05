package DynamicProgramming;

import java.util.Scanner;

public class MinimumOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int num = getMinOperation(n);
			System.out.println(num);
		}
	}

	private static int getMinOperation(int n) {
		int count =0;
		while(n > 0) {
			if(n%2 == 0) {
				n = n/2;
				count++;
			} else {
				n = n-1;
				count++;
			}
		}
		return count;
	}

}
