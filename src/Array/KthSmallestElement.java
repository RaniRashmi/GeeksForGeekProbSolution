package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			int size = Integer.parseInt(br.readLine());
			int [] arr = new int[size];
			String [] input = br.readLine().split(" ");
			for(int j=0;j<size;j++) {
				arr[j] = Integer.parseInt(input[j]);
			}
			int k = Integer.parseInt(br.readLine());
			//int kthElement = findKthElementInUnsortedArray(arr,k);
			int kthElement = findKthElementUsingPriorityQueue(arr,size,k);
			System.out.println(kthElement);
		}
		

	}

	private static int findKthElementUsingPriorityQueue(int[] arr, int size, int k) {
		// TODO Auto-generated method stub
			PriorityQueue<Integer>heap=new PriorityQueue<>();
			for(int i:arr){
			heap.add(i);
			if(heap.size()>arr.length-k+1)
				heap.poll();
			}
			return heap.poll();
	}

	private static int findKthElementInUnsortedArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr[k-1];
	}

}
