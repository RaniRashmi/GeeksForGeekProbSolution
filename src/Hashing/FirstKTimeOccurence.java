package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FirstKTimeOccurence {

	public static void main(String[] args) {
		
			  Scanner sc = new Scanner(System.in);

			  int noOfTestcases = sc.nextInt();

			  for(int i=0;i<noOfTestcases;i++) {

			   int n = sc.nextInt();

			   int k= sc.nextInt();

			   int [] arr = new int[n];

			   for(int j=0;j<n;j++) {

			    arr[j] = sc.nextInt();

			   }

			   getkTimeOccurence(arr, n, k);

			  }

			  

			 }



			 private static void getkTimeOccurence(int[] arr, int n, int k) {

			  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			  for(int i=0;i<n;i++) {

			     if(map.get(arr[i]) != null) {

			      map.put(arr[i], map.get(arr[i])+1);

			     } else {

			      map.put(arr[i], 1);

			     }

			  }

			  boolean flag = false;

			  for(int i=0;i<n;i++) {

			   if(map.get(arr[i]) == k){

			    System.out.println(arr[i]);

			    flag = true;

			    break;

			   }

			  }

			  if(flag == false) {

			   System.out.println("-1");

			  }

			 }

}
