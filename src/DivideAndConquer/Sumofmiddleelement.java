package DivideAndConquer;

import java.util.Scanner;

public class Sumofmiddleelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size1 = sc.nextInt();
			int size2 = sc.nextInt();
		
			int [] arr1 = new int[size1];
			int [] arr2 = new int[size2];
			
			for(int j=0;j<size1;j++) {
				arr1[j] = sc.nextInt();
			}
			
			for(int j=0;j<size2;j++) {
				arr2[j] = sc.nextInt();
			}
			
			int sum = findSum(arr1, arr2, size1,size2);
			System.out.println(sum);
	}

}

	private static int findSum(int[] arr1, int[] arr2, int size1, int size2) {
		int [] mergedElem = new int[size1 + size2];
		int i =0, j=0, r=0;
		int m = (size1+size2)/2;
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
		if(mergedElem.length%2 == 0) {
			return mergedElem[mergedElem.length/2]+mergedElem[mergedElem.length/2-1];
		} else {
			return mergedElem[mergedElem.length/2+1];
		}
		
	}
}
