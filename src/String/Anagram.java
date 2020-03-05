package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Anagram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String [] inputArray = br.readLine().split(" ");
		    String str1 = inputArray[0];
		    String str2 = inputArray[1];
		    boolean flag = isAnagram(str1,str2);
		    if(flag) {
		        System.out.println("YES");
		    }else {
		    	System.out.println("NO");
		    }
		}

	}

	private static boolean isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length())
			return false;
		int [] char_set = new int[256];
		for(int i=0;i<str1.length();i++) {
			char_set[str1.charAt(i)]++;
			char_set[str2.charAt(i)]--;
		}
		for(int i=0;i<str1.length();i++) {
			if(char_set[i]!=0) {
				return false;
			}
		}
		return true;
	}
}
