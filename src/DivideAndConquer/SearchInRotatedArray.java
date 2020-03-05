package DivideAndConquer;

import java.util.Scanner;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			
			
			int k = sc.nextInt();
			
			int result = search(arr, 0, arr.length-1,k);
			System.out.print(result);
		}
	}

	private static int search(int[] arr, int left, int right, int x) {
		int mid = (left+right)/2;
		if(arr[mid] == x) {
			return mid;
		}
		if(left > right) return -1;
		//left is sorted
		if(arr[left]<arr[mid]) {
			if(x >= arr[left] && x< arr[mid]) {
				search(arr, left, mid-1,x);
			} else {
				search(arr,mid+1, right, x);
			}
		}
		//right is sorted
		else if(arr[mid]<arr[left]) {
			if(x > arr[mid] && x <= arr[right]) {
				search(arr, mid+1, right, x);
			} else {
				search(arr, left, mid-1,x);
			}
		}
		
		else if(arr[left] == arr[mid]) {
			//if right is different, search it
			if(arr[mid] != arr[right]) {
				return search(arr,mid+1, right, x);
			} else {
				//we have to search both the half
				int result = search(arr, left, mid-1,x);
				if(result ==-1) {
					return search(arr, mid+1, right,x);
				} else {
					return result;
				}
			}
		}
			
	   return -1;		
	}

	

}
