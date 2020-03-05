package Hashing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class CountDinstictElementInEveryWindow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int size = sc.nextInt();
			int k = sc.nextInt();
			int [] arr = new int[size];
			
			for(int j=0;j<size;j++) {
				arr[j] = sc.nextInt();
			}
			
			countDinstict(arr, size, k);
		}
	}

	private static void countDinstict(int[] arr, int size, int k) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 for(int i=0;i<k;i++) {
			 list.add(arr[i]);
		 }
		 TreeSet<Integer> set = new TreeSet<Integer>(list);
		 System.out.print(set.size()+" ");
		 
		 for(int i=k;i<size;i++) {
			 list.add(arr[i]);
			 list.remove(0);
			 
			 TreeSet<Integer> newSet = new TreeSet<Integer>(list);
			 System.out.print(newSet.size()+" ");
			 
		 }
	}

}
