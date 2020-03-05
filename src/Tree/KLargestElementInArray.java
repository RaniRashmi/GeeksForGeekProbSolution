package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class KLargestElementInArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String[] s = br.readLine().split(" ");
		    int size = Integer.parseInt(s[0]);
		    int k =  Integer.parseInt(s[1]);
		    
		    String[] input = br.readLine().split(" ");
		    Integer[] arr = new Integer[size];
		    for (int j = 0; j < size; j++) {
		        arr[j] = Integer.parseInt(input[j]);;
		    } 
		    
		    kLargestElements(arr,size,k);
		}
		

	}

	private static void kLargestElements(Integer [] arr, int size, int k) {
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
