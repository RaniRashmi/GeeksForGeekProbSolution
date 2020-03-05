package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindLeadersInArray {

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
			
			findLeadersInArray(arr, arr[size-1], size-1);
			System.out.println( arr[arr.length - 1]);
		}
	}

	private static void findLeadersInArray(int[] arr, int max, int size) {
		if(size < 0) return;
		boolean isFoundLeader = false;
		if(arr[size] > max) {
			max = arr[size];
			isFoundLeader = true;
		}
		
		findLeadersInArray(arr, max, size-1);
		
		if(isFoundLeader) {
			System.out.print(max+" ");
		}
		
	}

//	private static void findLeadersInArray(int[] arr, int size) {
//		// TODO Auto-generated method stub
//		StringBuffer sb = new StringBuffer();
//		for(int i=arr.length-1, max = Integer.MIN_VALUE;i>=0;i--){
//			if(arr[i]>=max){
//			   max = arr[i];
//			   sb = new StringBuffer(arr[i] + " ").append(sb);
//			}
//		}
//		System.out.println(sb);
//	}

//	private static ArrayList<Integer> findLeadersInArray(int[] arr, int size) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer> list  = new ArrayList<Integer>();
//		int max = arr[size-1] ;
//		for ( int i = size-1; i >= 0; i-- ) {
//			if ( arr[i] >= max ) {
//				max = arr[i] ;
//				list.add(max);
//			}
//		}
//		return list;
//	}

}
