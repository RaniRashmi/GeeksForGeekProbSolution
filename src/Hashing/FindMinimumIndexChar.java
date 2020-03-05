package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindMinimumIndexChar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcase =Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcase;i++) {
			String str = br.readLine();
			String pat = br.readLine();
			findMinimumIndex(str,pat,str.length(),pat.length());
		}
	}

	private static void findMinimumIndex(String str, String pat, int m, int n) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<m;i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
			}
		}
		int minIndex = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(map.containsKey(pat.charAt(i)) && map.get(pat.charAt(i))<minIndex) {
				minIndex = map.get(pat.charAt(i));
			}
		}
		if(minIndex != Integer.MAX_VALUE) {
			System.out.println(str.charAt(minIndex));
		} else {
			System.out.println("$");
		}
	}

}
