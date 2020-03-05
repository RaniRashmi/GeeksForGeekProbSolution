package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeSortedArrayAlternative {
	
	public static void main (String[] args) throws NumberFormatException, IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j =0 ;j<noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			int [] arr = new int[size];
			for(int i=0;i<size;i++){
			   arr[i] = Integer.parseInt(input[i]); 
			}
			
			rearrangeSortedArrayAlternatively(arr,size);
		}
	}

	private static void rearrangeSortedArrayAlternatively(int[] arr, int size) {
		int mid = size/2;
		int i=0;
		for(int j=(size-1);j>=mid;j--) {
			System.out.print(arr[j]+" ");
			if(i < mid) {
				System.out.print(arr[i]+" ");
				i++;
			}
		}
	}
	
//	private static void rearrangeSortedArrayAlternatively(int [] arr,int size){
//	    int min_index = 0, max_index = size-1;
//	    int max_element = arr[max_index]+1;
//	    for(int i =0;i<size;i++){
//	        if(i%2 == 0){
//	            arr[i] += (arr[max_index]%max_element)*max_element;
//	            max_index--;
//	        } else{
//	            arr[i] += (arr[min_index]%max_element)*max_element;
//	            min_index++;
//	        }
//	    }
//	    for(int i=0;i<size;i++){
//	        arr[i] = arr[i]/max_element;
//	    }
//	}
}
