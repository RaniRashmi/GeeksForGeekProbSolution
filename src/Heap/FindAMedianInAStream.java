package Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindAMedianInAStream {
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder()); //keep track of min element
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); // keep track of max element
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		TrackMedian(arr,n);
	}

	private static void TrackMedian(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			addNum(arr[i]);
			System.out.print((int)getMedian()+" ");
		}
	}

	private static void addNum(int num) {
		if(maxHeap.isEmpty()) {
			maxHeap.add(num);
		} else if(maxHeap.size() == minHeap.size()) {
			if(num < minHeap.peek()) {
				maxHeap.add(num);
			} else {
				minHeap.add(num);
				maxHeap.add(minHeap.remove());
			}
		} else if(maxHeap.size() > minHeap.size()) {
			if(num > maxHeap.peek()) {
				minHeap.add(num);
			} else {
				maxHeap.add(num);
				minHeap.add(maxHeap.remove());
			}
		}
	}

	private static double getMedian() {
		if(maxHeap.isEmpty()) return 0;
		else if(maxHeap.size() == minHeap.size()) {
			return (maxHeap.peek() + minHeap.peek())/2.0;
		} else
		  return maxHeap.peek();
	}

}
