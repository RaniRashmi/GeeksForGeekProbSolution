package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FormPalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = br.readLine();
			//int x = findMinimumInsertion(str.toCharArray(),0,str.length()-1);
			int x = findMinimumInsertion(str.toCharArray(),str.length());
			System.out.println(x);
		}
           br.close();
	}

	private static int findMinimumInsertion(char[] str, int n) {
		int [][]table = new int[n][n];
		int low,high,i;
		for(i=1;i<n;i++) {
			for(low=0,high=i;high<n;low++,high++) {
				table[low][high] = (str[low] == str[high])?
						table[low+1][high-1]:
						Integer.min(table[low][high-1], table[low+1][high])+1;
			}
		}
		return table[0][n-1];
	}

//	private static int findMinimumInsertion(char[] str, int low, int high) {
//		if(low > high) return Integer.MAX_VALUE;
//		if(low == high) return 0;
//		if(low == high-1) return (str[low] == str[high])?0:1;
//		
//		return (str[low] == str[high])?
//				findMinimumInsertion(str, low+1,high-1):
//					Integer.min(findMinimumInsertion(str, low,high-1), findMinimumInsertion(str, low+1,high))+1;
//	}

}
