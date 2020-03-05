package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j =0 ;j<noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			int [] arr = new int[size];
			for(int i=0;i<size;i++){
			   arr[i] = Integer.parseInt(input[i]); 
			}
			
			sort012(arr,size);
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

	private static void sort012(int[] arr, int size) {
		// TODO Auto-generated method stub
		int low =0,high = size-1,mid =0,temp=0;
		while(mid <= high) {
			switch(arr[mid]) {
			case 0:
				swap(arr,low,mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr,mid,high);
				high--;
				break;
			}
		}
		
	}
	
	private static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
