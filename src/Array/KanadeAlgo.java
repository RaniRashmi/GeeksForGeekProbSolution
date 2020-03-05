package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KanadeAlgo {

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
			
			int sum = contigousSubArrayMaxSum(arr,size);
			System.out.println(sum);
		}
	}
	
	private static int contigousSubArrayMaxSum(int [] arr, int size){
	    int sum =0, currentSum =0;
	    for(int i=0;i<size;i++){
	        currentSum += arr[i];
	        if (currentSum < 0)  
	        	currentSum = 0;  
	          
	        else if (sum < currentSum)  
	            sum = currentSum;  
	          
	    }
	    if(sum == 0 && size ==1) return arr[0];
	    else if(sum > 0) return sum;
	    return -1;
	}

}
