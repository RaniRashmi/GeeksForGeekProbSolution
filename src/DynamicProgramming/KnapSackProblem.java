package DynamicProgramming;

import java.util.Scanner;

public class KnapSackProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int W = sc.nextInt();
			int [] val = new int[n];
			int [] wt = new int[n];
			for(int j=0;j<n;j++) {
				val[j] = sc.nextInt();
			}
			for(int k=0;k<n;k++) {
				wt[k] = sc.nextInt();
			}
			
			int x = knapSack(W, wt, val,n);
			System.out.println(x);
		}
	}

	private static int knapSack(int W, int[] wt, int[] val, int n) {
		int [][] dp = new int[n+1][W+1];
		int i, j;
		for(i=0;i<=n;i++) {
			for(j=0;j<=W;j++) {
				if(i ==0 || j==0) {
					dp[i][j] =0;
				} else if(wt[i-1]<=j) {
					dp[i][j]  = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}else {
					dp[i][j] = dp[i-1][W];
				}
			}
		}
				return dp[n][W];
	}

}
