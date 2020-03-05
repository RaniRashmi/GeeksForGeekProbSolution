package String;

import java.util.Scanner;

public class ConvertStringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int noOfTestcases = Integer.parseInt(sc.nextLine());
        for(int i=0;i<noOfTestcases;i++) {
        	String str = sc.nextLine();
        	int result = convertStringToInteger(str);
        	System.out.println(result);
        }
        sc.close();
	}

	private static int convertStringToInteger(String str) {
		// TODO Auto-generated method stub
		
		try{
			int i=0;
			boolean isNegative = false;
			int len = str.length();
			int number =0;
				if(str.charAt(0) == '-') {
					isNegative = true;
					i=1;
				}
				while(i<len) {
						number = number*10;
						number += (str.charAt(i++)-'0');
				}
				
				if(isNegative) {
					number = -number;
				}
				return number;
	      }
	      catch(NumberFormatException e)
	      {
	          return -1;
	      }
		
	}
	
}
