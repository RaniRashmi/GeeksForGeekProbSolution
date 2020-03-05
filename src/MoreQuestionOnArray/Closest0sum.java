package MoreQuestionOnArray;

import java.util.Scanner;

public class Closest0sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			int sum  = findClosestSum(arr,size);
			System.out.println(sum);
	}

}

	private static int findClosestSum(int[] arr, int size) {
		int l, r, min_sum, sum, min_l, min_r;
		if(size < 2) {
			return -1;
		}
		min_l = 0;
		min_r = 1;
		min_sum = arr[0]+arr[1];
		for(l=0;l<size-1;l++) {
			for(r = l+1;r<size;r++) {
				sum = arr[l]+arr[r];
				if(Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
				}
			}
		}
		return min_sum;
	}
}
