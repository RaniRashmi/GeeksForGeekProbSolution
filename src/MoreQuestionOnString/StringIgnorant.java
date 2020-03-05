package MoreQuestionOnString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringIgnorant {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		int noOfTestcases = sc.nextInt();
//		for(int i=0;i<noOfTestcases;i++) {
//			String str = sc.nextLine(); 
//			printString(str);
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = br.readLine();
			printString(str);
		}
	}

	private static void printString(String str) {
		int [] occurence = new int[256];
		String s = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		   char temp = s.charAt(i);
		   occurence[temp]++;
		   if(occurence[temp]%2 != 0) {
			   System.out.print(str.charAt(i));
		   }
		}
		System.out.println();
	}

}
