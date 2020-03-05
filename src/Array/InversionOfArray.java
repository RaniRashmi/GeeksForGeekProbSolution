package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversionOfArray {

	
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
				int count = inversionOfArray(arr);
				System.out.println(count);
	        }

       }
		
		private static  int  inversionOfArray(int[] arr) {
		   int count =0;
		   int len = arr.length;
		   for(int i=0;i<len;i++) {
			   for(int j=i+1;j<len;j++) {
				   if(arr[i] > arr[j]) {
					   count++;
				   }
			   }
				   
		   }
		  return count;
		}
}
