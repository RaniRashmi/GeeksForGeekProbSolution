package Array;

import java.util.Scanner;

public class LastIndexOfOne {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	     int notOfTestcase = sc.nextInt();
	     for(int k=0;k<notOfTestcase;k++) {
	      String str = sc.next();
	      printIndexOfLast1(str);
	     }
	    }



	    private static void printIndexOfLast1(String str) {
	            boolean flag=true;
				for(int i=str.length()-1;i>=0;i--)
				{
					if(str.charAt(i)=='1')
					{
						System.out.println(i);
						flag=false;
						break;
					}
					
				}
				if(flag==true)
				{
					System.out.println("-1");
				}
	    }

}
