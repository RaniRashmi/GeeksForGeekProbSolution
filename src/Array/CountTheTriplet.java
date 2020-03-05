package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountTheTriplet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j =0 ;j<noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			int [] arr = new int[size];
			for(int i=0;i<size;i++){
			   arr[i] = Integer.parseInt(input[i]); 
			}
			
			int count = doTripletCount(arr,size);
			System.out.println(count);
		}

	}
	
	private static int doTripletCount(int[] arr, int size) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
	    int count =0;
	    for(int i= size-1;i>=0;i--){
	        int j = i-1;
	        int k =0;
	        while(j>k){
	            if((arr[j]+arr[k]) == arr[i]){
	                count++;
	                j--;
	            } else if((arr[j]+arr[k]) < arr[i]){
	                k++;
	            } else{
	                j--;
	            }
	        }
	    }
	   
		    if(count > 0) return count;
		    return -1;
	}

}
