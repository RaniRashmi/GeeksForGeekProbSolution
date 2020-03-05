package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SwappingPairMakeEqualSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int [] arr1 = new int[n];
			int [] arr2 = new int[m];
			
			for(int j=0;j<n;j++) {
				arr1[j] = sc.nextInt();
			}
			
			for(int k=0;k<m;k++) {
				arr2[k] = sc.nextInt();
			}
			
			System.out.println(getSum(arr1, arr2, n,m)?1:-1);
		}
		
	}

	private static boolean getSum(int[] arr1, int[] arr2, int n, int m) {
		int sum1 =0, sum2=0;
		for(int i=0;i<n;i++) {
			sum1 += arr1[i];
		}
		for(int j=0;j<m;j++) {
			sum2 += arr2[j];
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			set.add(arr1[i]);
		}
		int sum = (sum1 - sum2)/2;
		for(int i= 0;i<m;i++) {
			if(set.contains(arr2[i]+sum)) {
				return true;
			}
		}
		return false;
	}

}
