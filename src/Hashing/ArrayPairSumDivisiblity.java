package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayPairSumDivisiblity {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int noofTestcases = sc.nextInt();
	    for(int i=0;i<noofTestcases;i++) {
	    	int n = sc.nextInt();
	    	int [] arr = new int[n];
	    	for(int j=0;j<n;j++) {
	    		arr[j]= sc.nextInt();
	    	}
	    	int k = sc.nextInt();
	    	boolean flag = hasPair(arr, n, k);
	    	if(flag) {
	    		System.out.println("True");
	    	}else {
	    		System.out.println("False");
	    	}
	    }
	}

	private static boolean hasPair(int[] arr, int n, int k) {
		if (n % 2 == 1) 
            return false; 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int rem = arr[i]%k;
			if(!map.containsKey(rem)) {
				map.put(rem, 1);
			} else {
				map.put(rem, map.get(rem)+1);
			}
		}
		
		for(int i=0;i<n;i++) {
			int rem = arr[i]%k;
			if(2*rem == k) {
				if(map.get(rem)%k == 1) {
					return false;
				} 
			}else if(rem == 0) {
				if(map.get(rem)%k == 1) {
					return false;
				} 
			}else {
				if(map.get(k-rem) != map.get(rem)) {
					return false;
				}
			}
		}
		return true;
	}

}
