package Amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrangetoFormBiggestNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++) {
			int arraySize = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			printLargest(input);
		}
	}

	private static void printLargest(String[] arr) {
		Arrays.sort(arr, new Comparator<String>(){
			 public int compare(String x, String y){
		            return (y+x).compareTo(x+y);
		        }
		});
		
		StringBuilder sb = new StringBuilder();
		for(String str : arr) {
			sb.append(str);
		}
		
		while(sb.charAt(0) == '0' && sb.length()>1) {
			sb.deleteCharAt(0);
		}
		System.out.println(sb.toString());
	}
}
