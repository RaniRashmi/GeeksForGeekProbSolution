package Hashing;

import java.util.Scanner;

public class SlidingWindowTechnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int k = sc.nextInt();
			int [] arr = new int[size];
			
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			
			int maxSum = findMaxSum(arr, k);
			System.out.println(maxSum);
	     }
        }

	private static int findMaxSum(int[] arr, int k) {
		int max_sum =0;
		int win_sum=0;
		for(int i=0;i<k;i++) {
			win_sum += arr[i];
		}
		for(int j=k;j<arr.length;j++) {
			//win_sum+ add end element + delete first element
			win_sum += arr[j]-arr[j-k];
			max_sum = Math.max(max_sum, win_sum);
		}
		return max_sum;
	}

//	//time complexity o(n*k)
//	private static int findMaxSum(int[] arr, int k) {
//		int maxSum =0;
//		int i, j;
//		for(i=0;i<arr.length-k;i++) {
//			int win_sum = 0;
//			for(j=i;j<i+k;j++) {
//				win_sum += arr[j];
//			}
//			maxSum = Math.max(maxSum, win_sum);
//		}
//		return maxSum;
//	}
}
