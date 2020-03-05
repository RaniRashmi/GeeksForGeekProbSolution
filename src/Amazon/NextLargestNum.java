package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextLargestNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++) {
			int size = Integer.parseInt(br.readLine());
		    String [] input = br.readLine().split(" ");
		    long [] arr = new long[size];
		    if(input != null) {
			    for(int j=0;j<size;j++) {
			    	arr[j]= Long.parseLong(input[j]);
			    }
			    //nextLargestNum(arr,size);
			    long [] output = nextLargestNumber(arr, size);
			    StringBuilder sb = new StringBuilder();
			    for(int k=0;k< size;k++) {
			    	sb.append(output[k]+" ");
			    }
			    System.out.println(sb.toString());
		    }
		}
	}

	private static long[] nextLargestNumber(long [] arr, int size) {
		long [] output = new long[size];
		Stack<Long> st = new Stack<Long>();
		for(int i= size-1;i>=0;i--) {
			long x = arr[i];
			while(!st.isEmpty() && x> st.peek()) {
				st.pop();
			}
			if(st.isEmpty()) {
				output[i] = -1;
			} else {
				output[i] = st.peek();
			}
			st.push(arr[i]);
		}
		return output;
	}

	private static void nextLargestNum(int[] arr, int size) {
		int i,j, next;
		for(i=0;i<size;i++) {
			next = -1;
			for(j=i+1;j<size;j++) {
				if(arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.print(next+" ");
		}
		System.out.println();
	}

}
