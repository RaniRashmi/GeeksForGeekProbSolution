package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumOfAllSubArrayOfSizeKBruteforce {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int noOfTestcases = Integer.parseInt(br.readLine());
	        for(int i=0;i<noOfTestcases;i++) {
	        	String [] input1 = br.readLine().split(" ");
	        	int arraySize = Integer.parseInt(input1[0]);
	        	int k = Integer.parseInt(input1[1]);
	        	String [] input2 = br.readLine().split(" ");
	        	int [] arr = new int[arraySize];
	        	for(int j=0;j<arraySize;j++) {
	        		arr[j] = Integer.parseInt(input2[j]);
	        	}
	        	printMaxK(arr,arraySize,k);
	        	System.out.println();
	        }
	}

	private static void printMaxK(int[] arr, int arraySize, int k) {
		int j, max;
		for(int i=0;i<=arraySize-k;i++) {
			 max = arr[i];
			 for(j=1;j<k;j++) {
				 if(arr[i+j] > max) {
					 max = arr[i+j];
				 }
			 }
			 System.out.print(max+" ");
		}
	}

}
