package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EditDistance {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++) {
			String [] sizeArr = br.readLine().split(" ");
			int m = Integer.parseInt(sizeArr[0]);
			int n = Integer.parseInt(sizeArr[1]);
			String [] inputStr = br.readLine().split(" ");
			String str1 = inputStr[0];
			String str2 = inputStr[1];
			
			int distance = editDistance(str1, str2, str1.length(), str2.length());
			System.out.println(distance);
	     }

    }

	private static int editDistance(String str1, String str2, int m, int n) {
		int dp[][] = new int[m+1][n+1]; 
		for(int i=1;i<=m ;i++) {
			for(int j=1;j<=n;j++) {
				//if first string is empty , only operation to do from second string
				//if second string is empty, only operation to do from first string
				if(i==0 || j==0) {
					dp[i][j] = Math.max(i,j);
				}
				//if last character is similar then recur next character
				else if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]);
					dp[i][j] = Math.min(dp[i-1][j-1], dp[i][j]);
					dp[i][j]+= 1;
				}
				
			}
		}
		
		return dp[m][n];
	}
}
