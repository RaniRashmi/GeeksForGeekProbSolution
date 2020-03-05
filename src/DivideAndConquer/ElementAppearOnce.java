package DivideAndConquer;

import java.util.Scanner;

public class ElementAppearOnce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			
			search(arr, 0, arr.length-1);
		}
	}

	private static void search(int[] arr, int low, int high) {
		if(low > high) {
			return;
		}
		if(low == high) {
			System.out.println(arr[low]);
			return;
		}
		int mid = (low+high)/2;
		if(mid%2 == 0) {
			if(arr[mid]== arr[mid+1]) {
				search(arr, mid+2, high);
			} else {
				search(arr, low, mid);
			}
		}
		else if(mid%2 == 1) {
			if(arr[mid] == arr[mid-1]) {
				search(arr, mid+1, high);
			} else {
				search(arr, low, mid-1);
			}
		}
	}

}
