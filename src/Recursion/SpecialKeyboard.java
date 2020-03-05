package Recursion;

import java.util.Scanner;

public class SpecialKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int num = findSum(n);
			System.out.println(num);
		}
	}

	private static int findSum(int n) {
		if(n < 0) return -1;
		if(n <= 6) return n;
		int max= 0;
		int multiplier = 2;
		for(int i= n-3;i>=1;i--) {
			int current = multiplier*findSum(i);
			if(current > max) {
				max = current;
			}
			multiplier++;
		}
		return max;
	}

}
