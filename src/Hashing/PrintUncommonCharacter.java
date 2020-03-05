package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class PrintUncommonCharacter {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			printUncommonChar(str1,str2);
		}
	}

	private static void printUncommonChar(String s1, String s2) {
		 HashSet<Character> set1 = new HashSet<Character>();
		 HashSet<Character> set2 = new HashSet<Character>();
		 HashSet<Character> temp = new HashSet<Character>();
		 
		 for(int i=0;i<s1.length();i++) {
			 set1.add(s1.charAt(i));
			 temp.add(s1.charAt(i));
		 }
		 for(int i=0;i<s2.length();i++) {
			 set2.add(s2.charAt(i));
		 }
		 set1.removeAll(set2);
		 set2.removeAll(temp);
		 
		 set1.addAll(set2);
		 
		 StringBuilder sb  = new StringBuilder();
		 for(char i : set1) {
			 sb.append(i);
		 }
		 char [] arr = sb.toString().toCharArray();
		 Arrays.sort(arr);
		 System.out.println(String.valueOf(arr));
		 
	}

}
