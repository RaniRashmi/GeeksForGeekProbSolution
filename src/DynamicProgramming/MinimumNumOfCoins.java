package DynamicProgramming;

import java.util.Scanner;

public class MinimumNumOfCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			minNumOfCoins(n);
		}
	}

	private static void minNumOfCoins(int n) {
		int [] coins = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int i=0;
		while(n >0) {
			while(n >= coins[i]) {
				n = n-coins[i];
				System.out.print(coins[i]+" ");
			}
			i++;
		}
		System.out.println();
	}

}
