package String;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			String strOutput = reverseWords(str);
			System.out.println(strOutput);
		}
        sc.close();
	}

	private static String reverseWords(String str) {
		// TODO Auto-generated method stub
		String [] strArray = str.split("\\.");
		StringBuffer sb = new StringBuffer();
		int i=0;
		for(i=strArray.length-1;i>0;i--) {
			sb.append(strArray[i]+".");
		}
		sb.append(strArray[i]);
		return sb.toString();
	
	}

}
