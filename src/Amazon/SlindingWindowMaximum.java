package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlindingWindowMaximum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++) {
			String [] sizeArr = br.readLine().split(" ");
			int size = Integer.parseInt(sizeArr[0]);
			int k = Integer.parseInt(sizeArr[1]);
			String [] inputStr = br.readLine().split(" ");
			int [] arr = new int[size];
			for(int j=0;j<size;j++) {
				arr[j] = Integer.parseInt(inputStr[j]);
			}
			
			printMax(arr, size, k);
	    }

    }

	private static void printMax(int[] arr, int size, int k) {
		Deque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
        int i;
        
        // first window
        for (i = 0; i < k; i++)
        {
            // remove all the smaller elements than current element in queue
            while(!dq.isEmpty() && dq.peekLast() < arr[i])
                dq.removeLast();
            
            // add current element to last in queue
            dq.addLast(arr[i]);
        }

        // rest windows
        for(; i < arr.length; i++)
        {
            // add maximum of previous window to stream
            sb.append(dq.peekFirst());
            sb.append(" ");
            
            // remove the current max in queue if it is out of the current window
            if(arr[i - k] == dq.peekFirst())
                dq.removeFirst();
            
            // remove all the smaller elements than current element in queue
            while(!dq.isEmpty() && dq.peekLast() < arr[i])
                dq.removeLast();
            
            // add current element to last in queue
            dq.addLast(arr[i]);
        }
        
        // add the maximum element of last window to stream
        sb.append(dq.peekFirst());
        sb.append("\n");
		System.out.print(sb);
	}
//	private static void printMax(int[] arr, int size, int k) {
//		int max;
//		for(int i=0;i<=size-k;i++) { 
//			max = arr[i];
//			for(int j=1;j<k;j++) {
//				if(arr[i+j]> max) {
//					max = arr[i+j];
//				}
//			}
//			System.out.print(max+" ");
//		}
//	}
}
