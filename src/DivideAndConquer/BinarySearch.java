package DivideAndConquer;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			int k = sc.nextInt();
			int result = binarySearch(arr, 0, arr.length-1,k);
			System.out.println(result);
		}
			
	}


	private static int binarySearch(int[] arr, int left, int right, int x) {
		if(left <= right) {
			int mid = left + (right-left)/2;
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x){
				return binarySearch(arr,left, mid-1, x);
			}
			return binarySearch(arr, mid+1, right, x);
		}
		return -1;
	}
}
