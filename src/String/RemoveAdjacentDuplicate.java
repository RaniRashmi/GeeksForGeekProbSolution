package String;

import java.util.Scanner;

public class RemoveAdjacentDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestCases;i++) {
			String str = sc.nextLine();
			String outputString = removeDuplicates(str);
			System.out.println(outputString.trim());
		}
       sc.close();
	}

	private static String removeDuplicates(String str) {
		// TODO Auto-generated method stub
		String outputString = " ";
		boolean b1 = false;
		boolean b2 = false;
		
		int i =0;
		int j =1;
		
		while(i< str.length()) {
			b1 = false;
			while(j < str.length() && str.charAt(i) ==  str.charAt(j)) {
				j++;
				b1 = true;
				b2 = true;
			}
			if(b1 == false) {
				outputString = outputString+ str.charAt(i);
				i++;
				j++;
			} else {
				i =j;
				j++;
			}
		}
		
		if(b2 == false) {
			return outputString;
		}
		return removeDuplicates(outputString);
	}

}
