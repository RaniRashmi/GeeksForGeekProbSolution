package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] arr1 = new int [n];
			int [] arr2 = new int [m];
			
			for(int j=0;j<n;j++) {
				arr1[j] = sc.nextInt();
			}
			for(int k=0;k<m;k++) {
				arr2[k] = sc.nextInt();
			}
			
			boolean flag = isSubset(arr1, arr2, n, m);
			if(flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	private static boolean isSubset(int[] arr1, int[] arr2, int n, int m) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			if(!hs.contains(arr1[i])) {
				hs.add(arr1[i]);
			}
		}
		
		for(int i=0;i<m;i++) {
			if(!hs.contains(arr2[i])) {
				return false;
			}
		}
		return true;
	}

}
