package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrStrImplementation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String [] input = br.readLine().split(" ");
			String str1 = input[0];
			String str2 = input[1];
			int index = findFirstOccurenceIndex(str1,str2);
			System.out.println(index);
		}

	}

	private static int findFirstOccurenceIndex(String str1, String str2) {
		// TODO Auto-generated method stub
		int m = str1.length();
		int n = str2.length();
		for(int i=0;i<=m-n;i++) {
			int j;
			for(j=0;j<n;j++) 
				if(str1.charAt(i+j) != str2.charAt(j)) {
					break;
				}
				
			if(j == n) {
				return i;
			}
		}
		return -1;
	}

//	private static int findFirstOccurenceIndex(String str1, String str2) {
//		// TODO Auto-generated method stub
//		int index =-1;
//		index = str1.indexOf(str2);
//		return index;
//	}

}
