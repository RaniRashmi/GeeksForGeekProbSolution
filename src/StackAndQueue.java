import java.util.Scanner;
import java.util.Stack;

public class StackAndQueue {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	private static boolean areParenthesisBalanced(String expression) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		for(int i=0;i<expression.length();i++) {
			if(expression.charAt(i)=='[' ||expression.charAt(i) == '{' || expression.charAt(i) == '(') {
				st.push(expression.charAt(i));
			}
			if(expression.charAt(i)==']' || expression.charAt(i) == '}' || expression.charAt(i)== ')') {
//				see the ending panthesis without starting parenthesis
				if(st.isEmpty()) {
					return false;
				} else if(!isMatchingPair((char)st.pop(),expression.charAt(i))) {
					return false;
				}
			}
		}
		
		if(st.isEmpty()) {
			return true;
		}
		return false;
	}
	
	  static boolean isMatchingPair(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 

}
