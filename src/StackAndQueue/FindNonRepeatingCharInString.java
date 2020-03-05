package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindNonRepeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			int size = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine();
			findFirstNonreapeatingChar(str);
		}

	}
//
//	private static int findFirstNonreapeatingChar(String str) {
//		// TODO Auto-generated method stub
//		int [] count = new int[256];
//		for(int i=0;i<str.length();i++) {
//			count[str.charAt(i)]++;
//		}
//		int index =-1,i;
//		for(i=0;i<str.length();i++) {
//			if(count[str.charAt(i)]==1) {
//				index =i;
//				break;
//			}
//		}
//		return index;	
//	}

	static void findFirstNonreapeatingChar(String str) 
    { 
        // count array of size 26(assuming 
        // only lower case characters are present) 
        int[] charCount = new int[26]; 
  
        // Queue to store Characters 
        Queue<Character> q = new LinkedList<Character>(); 
  
        // traverse whole stream 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
  
            // push each character in queue 
            q.add(ch); 
  
            // increment the frequency count 
            charCount[ch - 'a']++; 
  
            // check for the non repeating character 
            while (!q.isEmpty()) { 
                if (charCount[str.charAt(i)] > 1) 
                    q.remove(); 
                else { 
                    System.out.print(q.peek() + " "); 
                    break; 
                } 
            } 
            if (q.isEmpty()) 
                System.out.print(-1 + " "); 
        } 
        System.out.println(); 
    } 

}
