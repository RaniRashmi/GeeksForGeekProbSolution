package MoreQuestionOnArray;

import java.util.Scanner;

public class Consecutive1NotAllowed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int num = getCount(n);
			System.out.println(num);
		}
	}

	private static int getCount(int n) {
		int [] a = new int[n];
		int [] b = new int[n];
		
		a[0] =1;
		b[0] =1;
		
		for(int i=1;i<n;i++) {
			a[i] = (a[i-1]+b[i-1])%1000000007;
			b[i] = a[i-1];
		}
		return (a[n-1]+b[n-1]) %1000000007;
	}

}
