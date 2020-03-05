package Hashing;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SortingByFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for(int j=0;j<noOfTestCases;j++) {
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int i=0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			printArray(arr, size);
		}	
	}

	private static void printArray(int[] arr, int size) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0;i<size;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		while(size != 0) {
			int max_count =0; int index = -1;
			for(Entry<Integer, Integer> entry : map.entrySet()) {
				if(max_count< entry.getValue()) {
					max_count = entry.getValue();
					index = entry .getKey();
				}
			}
			
			for(int i=0;i<max_count;i++) {
				System.out.print(index+" ");
			}
			size = size- max_count;
			map.remove(index);
		 }
		System.out.println();
	}

}
