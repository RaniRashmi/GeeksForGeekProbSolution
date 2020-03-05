package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindAllPairWithSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int sum = sc.nextInt();
			
			int [] arr1 = new int[n1];
			int [] arr2 = new int[n2];
			
			for(int j=0;j<n1;j++) {
				arr1[j] = sc.nextInt();
			}
			for(int k=0;k<n2;k++) {
				arr2[k] = sc.nextInt();
			}
			findAllPair(arr1, arr2, n1, n2, sum);
		}
		
	}

	private static void findAllPair(int[] arr1, int[] arr2, int n1, int n2, int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Arrays.sort(arr1);
		for(int i=0;i<n2;i++) {
			if(!hs.contains(arr2[i]))
			 hs.add(arr2[i]);
		}
		String str = "";
		for(int i=0;i<n1;i++) {
			if(hs.contains(sum-arr1[i])) {
				str = str + arr1[i]+" "+(sum-arr1[i])+", ";
			}
		}
		 if(str.equals("")){
           System.out.println(-1); 
		 } else {
		   System.out.println(str.substring(0,str.length()-2));
		 }
	}

}
