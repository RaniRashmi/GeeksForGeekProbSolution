package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			boolean flag = areParenthesisBalanced(str);
	     	if(flag) {
				System.out.println("balanced");
			} else {
				System.out.println("not balanced");
			}
		}
	}

	private static boolean areParenthesisBalanced(String str) {
		Stack st = new Stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '[' || str.charAt(i) == '{' ||str.charAt(i) == '(') {
				st.push(str.charAt(i));
			}
			if(str.charAt(i) == ']' || str.charAt(i) == '}' ||str.charAt(i) == ')') {
				if(st.isEmpty()) {
					return false;
				} else if(!isMatching((char)st.pop(),str.charAt(i))){
					return false;
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		}
		return false;
	}

	private static boolean isMatching(char character1, char character2) {
		if(character1 == '(' && character2 == ')') {
			return true;
		} else if(character1 == '[' && character2 == ']') {
			return true;
		} if(character1 == '{' && character2 == '}') {
			return true;
		}
		return false;
	}

}
