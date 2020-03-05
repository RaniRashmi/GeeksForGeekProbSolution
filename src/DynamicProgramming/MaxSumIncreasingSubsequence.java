package DynamicProgramming;

import java.util.Scanner;

public class MaxSumIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int length = sc.nextInt();
			int [] arr = new int[length];
			for(int j=0;j<length;j++) {
				arr[j] = sc.nextInt();
			}
			int result = lis( arr, length);
			System.out.println(result);
		}
	}

	private static int lis(int[] arr, int n) {
		int [] lis = new int[n];
		int i,j, max =0;
		for ( i = 0; i < n; i++ ) 
            lis[i] = arr[i]; 
		for(i=1;i<n;i++) {
			for(j=0;j<i;j++) {
				if(arr[j] < arr[i] && lis[j]+arr[i] >lis[i]) {
					lis[i] = lis[j]+arr[i];
				}
			}
		}
		
		for(i=0;i<n;i++) {
			if(max < lis[i]) {
				max = lis[i];
			}
		}
		return max;
	}

}
