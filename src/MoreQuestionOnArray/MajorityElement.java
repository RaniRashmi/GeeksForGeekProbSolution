package MoreQuestionOnArray;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			int  majElem = findMajElem(arr, arr.length);
			System.out.println(majElem);
		}
	}

	private static int findMajElem(int[] arr, int length) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i< length;i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i])+1;
				if(count > length/2) {
					return arr[i];
				} else {
					map.put(arr[i],count);
				}
			}else {
				map.put(arr[i], 1);
			}
		}
		return -1;
	}
}
