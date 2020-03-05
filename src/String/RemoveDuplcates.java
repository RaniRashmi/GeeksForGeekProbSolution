package String;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class RemoveDuplcates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			String result = removeDuplicates(str);
			System.out.println(result);
		}
        sc.close();
	}

	private static String removeDuplicates(String str) {
		// TODO Auto-generated method stub
		char [] char_set = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(char c : char_set) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(Character c : set) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	//this will work for sorted string

//	private static String removeDuplicates(String str) {
//		int pos =0;
//		StringBuffer sb = new StringBuffer();
//		sb.append(str.charAt(0));
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) != sb.charAt(pos)) {
//				sb.append(str.charAt(i));
//				pos++;
//			}
//		}
//		return sb.toString();
//	}
}
