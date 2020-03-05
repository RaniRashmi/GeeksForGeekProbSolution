package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j =0 ;j<noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			int [] arr = new int[size-1];
			for(int i=0;i<size-1;i++){
			   arr[i] = Integer.parseInt(input[i]); 
			}
			
			int missingNum = missingNumber(arr,size-1);
			System.out.println(missingNum);
		}
	}

	private static int missingNumber(int[] arr, int size) {
		// TODO Auto-generated method stub
		int totalSum;
		totalSum = (size + 1) * (size + 2) / 2; ;
		for(int i =0;i< size;i++) {
			totalSum -= arr[i]; 
		}
		return totalSum;
	}

}
