package String;

import java.util.Scanner;

public class RomanToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			int result = convertRomanToDecimal(str);
			System.out.println(result);
		}

	}
	
	private static int value(char c) {
		switch(c) {
		case 'I':
             return 1;
		case 'V':
			 return 5;
		case 'X':
			 return 10;
		case 'L':
			 return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;  
		}
		return -1;
	}

	private static int convertRomanToDecimal(String str) {
		// TODO Auto-generated method stub
		int result =0;
		for(int i=0;i<str.length();i++) {
			int s1 = value(str.charAt(i));
			if(i+1 < str.length()){
				int s2 = value(str.charAt(i+1));
				if(s1>=s2) {
					result = result+s1;
				} else {
					result = result+s2-s1;
					i++;
				}
			} else {
				result = result+s1;
				i++;
			}
			
		}
		return result;
	}

}
