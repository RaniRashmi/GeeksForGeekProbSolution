package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedChar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = br.readLine();
			printRepeatedChar(str);
		}
	}

	private static void printRepeatedChar(String str) {
		HashSet<Character> hs=new HashSet<Character>();
	    hs.add(str.charAt(0));
        int flag=0; 
	    for(int i=1;i<str.length();i++)
	    {
	        if(hs.contains(str.charAt(i)) )
	        {
	            System.out.println(str.charAt(i));
	            flag=1;
	            break;
	        }
	        else
	        {
	            hs.add(str.charAt(i));
	        }
	    }
	    if(flag==0)
	    System.out.println("-1");
	}

//	private static void printRepeatedChar(String str) {
//		
//		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
//		for(int i=0;i<str.length();i++) {
//			if(!map.containsKey(str.charAt(i))) {
//				map.put(str.charAt(i), 1);
//			} else {
//				map.put(str.charAt(i), map.get(str.charAt(i))+1);
//			}
//		}
//		
//		String newStr ="";
//		for(int i=0;i<str.length();i++) {
//			if(map.get(str.charAt(i)) > 1) {
//				newStr += str.charAt(i);
//				break;
//			}
//		}
//		
//		if(newStr == "") {
//			System.out.println(-1);
//		} else {
//			System.out.println(newStr);
//		}
//		
//	}

}
