package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MinHeap{
	int heapSize;
	int [] heapArray;
	public MinHeap(int [] arr, int size) {
		heapSize = size;
		heapArray = arr;
		int i = (heapSize-1)/2;
		while (i >= 0) { 
		minHeapify(i);
		i--;
		}
		
	}
	private void minHeapify(int i) {
		// TODO Auto-generated method stub
		int l= left(i);
		int r = right(i);
		int smallest = i;
		if(l< heapSize && heapArray[l]<heapArray[i]) {
			smallest = l;
		}
		if(r< heapSize  && heapArray[r]<heapArray[smallest]) {
			smallest = r;
		}
		if(smallest != i) {
			swap(heapArray[i],heapArray[smallest]);
			minHeapify(smallest);
		}
		
	}
	private void swap(int i, int j) {
		int temp = i;
		i=j;
		j=temp;
		
	}
	private int parent(int i) {
		return (i-1)/2;
	}
	private int left(int i) {
		// TODO Auto-generated method stub
		return (2*i+1);
	}
	private int right(int i) {
		// TODO Auto-generated method stub
		return (2*i+2);
	}
	
	int extractMin() {
		if(heapSize == 0) {
			return 0;
		}
		
		int root = heapArray[0];
		if(heapSize >1) {
			heapArray[0] = heapArray[heapSize-1];
			minHeapify(0);																										minHeapify(0);
		}
		heapSize--;
		return root;
	}
	
	 public int getMin() {
      return heapArray[0];  // Returns minimum
	 }
}
public class KthSmallestElementUsingMinHeap {

	 public static void main(String[] args) throws NumberFormatException, IOException {

		  // TODO Auto-generated method stub

			  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  int noOfTestcases = Integer.parseInt(br.readLine());
			  for(int i=0;i<noOfTestcases;i++) {
			   int size = Integer.parseInt(br.readLine());
			   String [] input = br.readLine().split(" ");
			   int [] arr = new int[size];
			   for(int j=0;j<size;j++) {
			    arr[j] = Integer.parseInt(input[j]);
			   }
			   int k = Integer.parseInt(br.readLine());
			   int kthMinElement = kthSmallestElement(arr,size,k);
			   System.out.println(kthMinElement);
			  }
			  br.close();
	  }

	private static int kthSmallestElement(int[] arr, int size, int k) {
		// TODO Auto-generated method stub
		MinHeap minHeap = new MinHeap(arr,size);
		for(int i=0;i<k-1;i++) {
		  minHeap.extractMin();
		}
		return minHeap.getMin();
	}
}
