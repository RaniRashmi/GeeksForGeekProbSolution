package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSubArraywithTargetSumUsingBufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcases; i++) {
			
			String[] s = br.readLine().split(" ");
		    int size = Integer.parseInt(s[0]);
		    int sum =  Integer.parseInt(s[1]);
		    
		    String[] input = br.readLine().split(" ");
		    int arr[] = new int[size];
		    for (int j = 0; j < size; j++) {
		        arr[j] = Integer.parseInt(input[j]);;
		    } 
		    
		    subarraySum(arr, size, sum);
		}

	}

	private static int subarraySum(int[] arr, int size, int targetSum) {
		// TODO Auto-generated method stub
		int start = 0, end =0, currentSum =0;
	    for(int i=0;i<=size;i++){
	        while(currentSum > targetSum && start<i){
	            currentSum = currentSum - arr[start];
	            start++;
	        }
	        if(currentSum == targetSum){
	            end = i-1;
	            start++;
	            end++;
	            System.out.println(start+" "+end);
	            return 1;
	        }
	        if(i< size){
	            currentSum = currentSum + arr[i];
	        }
	    }
	    System.out.println(-1);
	    return 0;
		
	}

}
