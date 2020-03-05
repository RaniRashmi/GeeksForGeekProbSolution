package InterviewBit;

import java.util.Scanner;

public class SwapCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int b  = Integer.parseInt(sc.nextLine());
		int c  = Integer.parseInt(sc.nextLine());
		System.out.println(BSwaps(str,b,c));

	}

	private static char []  BSwaps(String str, int b, int c) {
		// TODO Auto-generated method stub
		int n = str.length();
		String newStr = null;
		char [] ch = str.toCharArray();
		for(int i=0;i<b;i++) {
			int x = (i+1)%n;
			int y = (i+1+c)%n;
			char temp = ch[x];
			ch[x] = ch[y];
			ch[y] = temp; 
		}
		return ch;
	}



}
