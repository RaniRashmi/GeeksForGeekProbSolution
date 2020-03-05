package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class TwoArrayAreEqual {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			int n = Integer.parseInt(br.readLine());
			String [] arr1 = br.readLine().split(" ");
			String [] arr2 = br.readLine().split(" ");
			
			boolean flag = isEqual(arr1, arr2, n);
			if(flag) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	private static boolean isEqual(String[] arr1, String[] arr2, int n) {
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<n;i++) {
			if(!set.contains(arr1[i])) {
				set.add(arr1[i]);
			}
		}
		for(int i=0;i<n;i++) {
			if(!set.contains(arr2[i])) {
				return false;
			}
		}
		return true;
	}

}
