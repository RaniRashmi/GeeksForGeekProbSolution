package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLatrgestElementInStream {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();

        int t = scan.nextInt();
        for(int ii=0; ii<t; ii++){
            int k = scan.nextInt();
            int n = scan.nextInt();
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = scan.nextInt();
                
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0; i<k; i++){
                pq.add(arr[i]);
                if(i!=k-1)
                    ans.append("-1 ");
            }
                
            for(int i=k; i<n; i++){
                ans.append(pq.peek() + " ");
                if(pq.peek() < arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
            ans.append(pq.poll()).append("\n");
        }
        System.out.print(ans);
	}

}
