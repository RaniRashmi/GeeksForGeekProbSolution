package DivideAndConquer;

import java.util.Scanner;

public class KthElementTwoSortedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size1 = sc.nextInt();
			int size2 = sc.nextInt();
			int k = sc.nextInt();
			
			int [] arr1 = new int[size1];
			int [] arr2 = new int[size2];
			
			for(int j=0;j<size1;j++) {
				arr1[j] = sc.nextInt();
			}
			
			for(int j=0;j<size2;j++) {
				arr2[j] = sc.nextInt();
			}
			
			
			
			int kthElem = findElement(arr1, arr2, size1, size2,k);
			System.out.println(kthElem);
		}
	}

	private static int findElement(int[] arr1, int[] arr2, int size1, int size2, int k) {
		int [] mergedElem = new int[size1 + size2];
		int i =0, j=0, r=0;
		while(i < size1 && j<size2) {
			if(arr1[i] < arr2[j]) {
				mergedElem[r++] = arr1[i++];
			} else {
				mergedElem[r++] = arr2[j++];
			}
		}
		
		while(i < size1) {
			mergedElem[r++] = arr1[i++];
		}
		
		while(j< size2) {
			mergedElem[r++] = arr2[j++];
		}
		return mergedElem[k-1];
	}

}
