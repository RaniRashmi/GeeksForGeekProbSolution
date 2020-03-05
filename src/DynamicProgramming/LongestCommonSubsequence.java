package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonSubsequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String [] lengthArr = br.readLine().split(" ");
			int length1 =  Integer.parseInt(lengthArr[0]);
			int length2 =  Integer.parseInt(lengthArr[1]);
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			int maxLength = LCS(str1.toCharArray(), str2.toCharArray(),length1,length2);
			System.out.println(maxLength);
		}
	}

	private static int LCS(char[] charArray1, char[] charArray2, int m, int n) {
		int [][] dp = new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					dp[i][j] =0;
				} else if(charArray1[i-1] == charArray2[j-1]) {
					dp[i][j] = dp[i-1][j-1]+1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}
			

}
