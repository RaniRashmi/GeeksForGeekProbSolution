package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++) {
			int arraySize = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			int [] arr = new int[arraySize];
			for(int j=0;j<arraySize;j++) {
				arr[j] = Integer.parseInt(input[j]);
 			}
			boolean flag = findTriplet(arr,arraySize);
			if(flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	private static boolean findTriplet(int[] arr, int arraySize) {
		for(int i=0;i<arraySize;i++) {
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		
		for(int i = arraySize-1;i>=2;i--) {
			int left =0;
			int right = i-1;
			while(left < right) {
				if(arr[left]+arr[right] == arr[i]) {
					return true;
				}
				if(arr[left]+arr[right] < arr[i]) {
					left++;
				} else {
					right--;
				}
			}
		}
		
		return false;
	}

}
