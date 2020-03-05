package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayInGroup {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcases; i++) {
			String[] s = br.readLine().split(" ");
		    int size = Integer.parseInt(s[0]);
		    int k =  Integer.parseInt(s[1]);
		    
		    String[] input = br.readLine().split(" ");
		    int arr[] = new int[size];
		    for (int j = 0; j < size; j++) {
		        arr[j] = Integer.parseInt(input[j]);;
		    } 
			reverse(arr,size,k);
            
			StringBuffer sb = new StringBuffer(); 
            for (int x = 0; x < size; x++) 
                sb.append(arr[x] + " "); 
  
            // finally printing the string 
            System.out.println(sb); 
		}
        br.close();
	}

	

	 private static void reverse(int arr[], int n, int k) 
	    { 
	        for (int i = 0; i < n; i += k) 
	        { 
	            int left = i; 
	      
	            // to handle case when k is not multiple 
	            // of n 
	            int right = Math.min(i + k - 1, n - 1); 
	            int temp; 
	              
	            // reverse the sub-array [left, right] 
	            while (left < right) 
	            { 
	                temp=arr[left]; 
	                arr[left]=arr[right]; 
	                arr[right]=temp; 
	                left++; 
	                right--; 
	            } 
	        } 
	    } 

}
