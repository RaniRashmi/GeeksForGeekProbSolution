package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayOfLenZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for(int i=0;i<noOfTestCases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			int length = getLength(arr, size);
			System.out.println(length);
		}
	}

	private static int getLength(int[] arr, int size) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max_len = 0, sum =0;
		for(int i=0;i<size;i++) {
			sum += arr[i];
			if(arr[i] == 0 && max_len == 0) {
				max_len = 1;
			}
			if(sum == 0) {
				max_len = i+1;
			}
			
			Integer prev_i = map.get(sum);
			// If this sum is seen before, then update max_len 
			if(prev_i != null) {
				max_len = Math.max(max_len, i-prev_i);
			} else {
				map.put(sum, i);
			}
		}
		return max_len;
	}

//	//time complexity 0(n^2)
//	private static int getLength(int[] arr, int size) {
//		int max_len =0;
//		for(int i=0;i<size;i++) {
//			int curr_sum = 0;
//			for(int j=i;j<size;j++) {
//				curr_sum += arr[j];
//	
//				if(curr_sum == 0) {
//				  max_len = Math.max(max_len, j-i+1);
//				}
//			}
//		}
//		return max_len;
//	}

}
