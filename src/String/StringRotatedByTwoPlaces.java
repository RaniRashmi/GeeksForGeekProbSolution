package String;

import java.util.Scanner;

public class StringRotatedByTwoPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			int flag = stringRotation(str1,str2);
			System.out.println(flag);
		}

	}

	private static int stringRotation(String str1, String str2) {
		// TODO Auto-generated method stub
		String newStr = str1+str1;
		return isSubstring(newStr,str2);
	}

	private static int isSubstring(String newStr, String str) {
		if(newStr.contains(str))
			return 1;
		return 0;
	}

}
