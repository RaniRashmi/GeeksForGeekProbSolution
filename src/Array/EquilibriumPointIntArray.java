package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPointIntArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j=0;j< noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			int [] arr = new int[size];
			for(int i=0; i<arr.length;i++) {
				arr[i] = Integer.parseInt(input[i]);
			}
			
			int equilibruimPosition = findEquilibruimPosition(arr, size);
			System.out.println(equilibruimPosition);
		}

	}

//	time complexity 0(size) 
	private static int findEquilibruimPosition(int[] arr, int size) {
		// TODO Auto-generated method stub
		int sum =0, leftSum = 0;
		if(arr.length == 1) return 1;
//		total sum of arr
		for(int i=0;i<size;i++) {
			sum += arr[i];
		}
//      right sum of arr
		for(int i=0;i<size;i++) {
			sum -= arr[i];
			
			if(leftSum == sum) {
				return i+1;
			}
			
			leftSum += arr[i];
		}
		
		return -1;
	}
	
//	time complexity 0(n^2)
	
	private static int findEquilibruimPositionBruteForce(int[] arr, int size) {
		int leftSum , rightSum;
		if(arr.length == 1) return 1;
		for(int i=0;i<size;i++) {
			leftSum = 0;
			rightSum = 0;
			for(int j =0;j<i;j++) {
				leftSum += arr[i];
			}
			for(int j = i;j<size;j++) {
				rightSum += arr[i];
			}
			if(leftSum == rightSum) {
				return i+1;
			}
		}
		return -1;
	}

}
