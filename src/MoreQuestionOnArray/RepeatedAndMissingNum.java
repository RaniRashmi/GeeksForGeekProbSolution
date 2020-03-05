package MoreQuestionOnArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RepeatedAndMissingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			repeatedAndMissingNumber(arr, size);
			System.out.println();
		}
	}

	private static void repeatedAndMissingNumber(int[] arr, int size) {
		Arrays.sort(arr);
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.print(arr[i]+" ");
				break;
			} else {
				continue;
			}
		}
		
		for(int i=1;i<=arr.length;i++) {
			if(!set.contains(i)) {
				System.out.print(i+" ");
				break;
			}
		}
	}

//	private static void repeatedAndMissingNumber(int[] arr, int size) {
//		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
//		for(Integer i : arr) {
//			if(map.get(i) == null) {
//				map.put(i, true);
//			} else {
//				System.out.print(i+" ");
//			}
//		}
//		for(int i=1;i<=arr.length;i++) {
//			if(map.get(i) == null) {
//				System.out.print(i);
//			}
//		}
//	}

}
