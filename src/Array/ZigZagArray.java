package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZigZagArray {

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
			zigZagArray(arr,size);
			StringBuffer sb = new StringBuffer(); 
            for (int x = 0; x < size; x++) 
                sb.append(arr[x] + " "); 
  
            // finally printing the string 
            System.out.println(sb); 
		}
		br.close();
	}

//	separate swap will not work because we are tempering in one array only
	private static void zigZagArray(int[] arr, int size) {
		// TODO Auto-generated method stub	 c
		int temp =0;
		for(int i=0;i<size-1;i++) {
			if(i%2 == 0) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]=temp;
				}
			} else {
				if(arr[i]<arr[i+1]) {
					temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
}
