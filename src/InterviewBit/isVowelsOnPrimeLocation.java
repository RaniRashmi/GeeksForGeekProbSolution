package InterviewBit;

import java.util.Scanner;

public class isVowelsOnPrimeLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = isVowelPrimeLocation(str);
        System.out.println(flag);
	}

	private static boolean isVowelPrimeLocation(String str) {
//		check string contains vowel or not if not then return false
//		if(!str.matches("[aeiou]")) {
//			return false;
//		}
		if(!vowels(str)) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			  int num =i;
	          boolean prime = isPrime(num+1);
	          //System.out.println("ith : "+i+" "+prime);
	          char c = str.charAt(i);
	          if(c == 'a' || c== 'e'|| c== 'i' || c== 'o'|| c=='u') {
	        	  if(prime == false) {
	        		  return false;
	        	  }
       		  }
		}
		return true;
	}
	
	 public static boolean vowels(String s){
	        char[] words = s.toCharArray();
	        for(int i = 0; i<words.length; i++){
	            char z = words[i];
	            if (z=='a'||z=='e'||z=='i'||z=='o'||z=='u') return true;
	        }
	        return false;
	    }

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
        if(num <= 1) return false;
        for(int i=2;i<num;i++) {
        	if(num % i == 0) {
        		return false;
        	}
        }
		return true;
	}

}
