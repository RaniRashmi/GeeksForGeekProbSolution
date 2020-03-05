package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSubsecunce {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int noofTestcases = sc.nextInt();
		    for(int i=0;i<noofTestcases;i++) {
		    	int n = sc.nextInt();
		    	int [] arr = new int[n];
		    	for(int j=0;j<n;j++) {
		    		arr[j]= sc.nextInt();
		    	}
		
		    	int len = LCS(arr, n);
		    	System.out.println(len);
		    }
	}



	private static int LCS(int[] arr, int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			hs.add(arr[i]);
		}
		int max =0;
		for(int i=0;i<n;i++) {
			if(!hs.contains(arr[i]-1)) {
				int j = arr[i];
				while(hs.contains(j))
					j++;
				if(max < j-arr[i]) {
					max = j-arr[i];
				}
			}
		}
		return max;
	}
}
