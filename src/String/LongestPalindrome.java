package String;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			findLongestPalindrome(str);
		}
        sc.close();
	}

	private static void findLongestPalindrome(String str) {
		// TODO Auto-generated method stub
		int len = str.length();
	    boolean[][] table = new boolean[len][len];
	    for(int i = 0;i<str.length();i++){
	    	table[i][i] = true;
	    }
	    int start = 0;
	    int maxLength = 1;
	    for(int i = 0;i<len-1;i++){
	        if(str.charAt(i)==str.charAt(i+1)){
	           if(maxLength<2){
		            start = i;
		            maxLength = 2;
	           }
	           table[i][i+1] = true;
	           
	        }
	    }
	    for(int k = 3;k<=len;k++){
	        for(int i = 0;i<len-k+1;i++){
	            int j = i+k-1;
	            if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)){
	                if(maxLength<k){
	                	maxLength = k;
	                    start = i;
	                }
	                table[i][j] = true;
	            }
	            
	        }
	    }
	    System.out.println(str.substring(start,start+maxLength));
		
	}
}
	
	
	
	


//	private static void findLongestPalindrome(String str) {
//		// TODO Auto-generated method stub
//		int len = str.length();
//		boolean [][] table = new boolean[len][len];
//		int maxLength =1;
//		int start = 0;
////		for one length string
//		for(int i=0;i<len;i++) {
//			table[i][i] = true;
//		}
//		
////		for 2 length string
//		for(int i=0;i<len-1;i++) {
//			if (str.charAt(i) == str.charAt(i + 1)) {
//				table[i][i+1]= true;
//				start = i;
//				maxLength = 2;
//			}
//		}
////		for more length string
//		for(int k=3;k<=len;k++) {
////			for fix starting index
//			for(int i=0;i<len-k+1;i++) {
////				for fixing end index
//				int j= i+k-1;
//				if(table[i+1][j-1] && str.charAt(i) == str.charAt(j)) {
//					table[i][j] = true;
//					if(k>maxLength) {
//					start = i;
//					maxLength = k;
//					}
//				}
//			}
//		}
//		maxSubstring(str,start,start+maxLength-1);
//	}
//
//	private static void maxSubstring(String str, int start, int end) {
//		System.out.println(str.substring(start, end+1));
//	}


