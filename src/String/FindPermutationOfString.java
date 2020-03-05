package String;

import java.util.Arrays;
import java.util.Scanner;

public class FindPermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			//permutate(str.toCharArray(),0);
			char [] charArray = str.toCharArray();
			Arrays.sort(charArray);
			permutate(new String(charArray),"");
			System.out.println();
		}
		sc.close();

	}

	private static void permutate(String input, String choosen) {
		// TODO Auto-generated method stub
		if(input == null ||input.length() ==0) {
			System.out.print(choosen+" ");
		}
		
		for(int i=0;i<input.length();i++) {
			String newSelected = choosen + input.charAt(i);
			String newInput = input.substring(0, i)+input.substring(i+1,input.length());
			permutate(newInput,newSelected);
		}
		
	}
	
	

////	not in lexcographic oreder
//	private static void permutate(char[] charArray, int currentIndex) {
//		// TODO Auto-generated method stub
//		if(currentIndex == charArray.length) {
//			System.out.print(String.valueOf(charArray)+ " ");
//		}
//		for(int i= currentIndex;i<charArray.length;i++) {
//			swap(charArray,currentIndex,i);
//			permutate(charArray,currentIndex+1);
//			swap(charArray,currentIndex,i);
//		}
//		
//	}
//
//	private static void swap(char[] charArray, int currentIndex, int i) {
//		// TODO Auto-generated method stub
//		char temp = charArray[currentIndex];
//		charArray[currentIndex] = charArray[i];
//		charArray[i] = temp;
//	}

	
}
