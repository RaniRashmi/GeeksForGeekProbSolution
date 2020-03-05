package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			int len = Integer.parseInt(br.readLine());
			String [] input = br.readLine().split(" ");
			String str = findLongestPrefix(input,len);
			System.out.println(str);
		}

	}

	private static String findLongestPrefix(String[] input, int len) {
		// TODO Auto-generated method stub
		String minPrefixStr = getMinStr(input);
		int minPrefixStrLength = minPrefixStr.length();
		for(int i=0;i<input.length;i++) {
			int j;
			for(j=0;j<minPrefixStrLength;j++) {
				if(minPrefixStr.charAt(j) != input[i].charAt(j)) {
					break;
				}
				if(j > minPrefixStrLength) {
					minPrefixStrLength = j;
				}
			}
		}
		return minPrefixStr.substring(0, minPrefixStrLength);
	}

	private static String getMinStr(String[] input) {
		// TODO Auto-generated method stub
		String minStr = input[0];
		for(int i=1;i<input.length;i++) {
			if(input[i].length()<minStr.length()) {
				minStr = input[i];
			}
		}
		return minStr;
	}

//	private static String findLongestPrefix(String[] input,int len) {
//		// TODO Auto-generated method stub
//		int index = findMinLength(input,len);
//		System.out.println(index);
//		int low =0;
//		int high = index;
//		String prefix = "";
//		while(low <= high) {
//			int mid = (low+high)/2;
//			if(allContainsPrefix(input,len,input[0],low,mid)) {
//				prefix = prefix + input[0].substring(low, mid+1);
////				look in to the right
//				low = mid+1;
//			} else {
////				look in to the left
//				high = mid-1;
//			}
//		}
//		return prefix;
//	}
//
//	private static boolean allContainsPrefix(String[] input, int len, String str, int start, int end) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<=(len-1);i++) {
//			String arr_i = input[i]; 
//			for(int j=start;j<end;j++) {
//			   if(arr_i.charAt(j) != str.charAt(j)){
//				   return false;
//			   }
//			}
//		}
//		return true;
//	}
//
//	private static int findMinLength(String[] input, int len) {
//		// TODO Auto-generated method stub
//		int minLength = Integer.MAX_VALUE;
//		for(int i=0;i<=(len-1);i++) {
//			if(input[i].length()<minLength) {
//			  minLength = input[i].length();
//			}
//		}
//		return minLength;
//	}

	
}
