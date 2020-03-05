package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j =0 ;j<noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			long [] arr = new long[size];
			for(int i=0;i<size;i++){
			   arr[i] = Long.parseLong(input[i]);
			}
			nextGreaterElement(arr,size);
		}
		br.close();

	}

	private static void nextGreaterElement(long[] arr, int size) {
		// TODO Auto-generated method stub
		Stack<Long> st = new Stack<Long>();
		long [] outputArr = new long[size];
		for(int i=size-1;i>=0;i--) {
			while(!st.isEmpty() && st.peek()<=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				outputArr[i] =-1;
			} else {
				outputArr[i] = st.peek();
			}
			
			st.push(arr[i]);
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(outputArr[i]+" ");
		}
		System.out.println();
		
	}

}
