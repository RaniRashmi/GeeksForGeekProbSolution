package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestDistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int noOfTestcases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfTestcases;i++) {
			String str = sc.nextLine();
			int result = findLongestDistictCharacterCount(str);
			System.out.println(result);
		}
	}

	private static int findLongestDistictCharacterCount(String str) {
		// TODO Auto-generated method stub
		int i=0,j=0,maxCount=0,len=str.length();
		Set<Character> set = new HashSet<>();
		while(i< len && j<len) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				maxCount = Math.max(maxCount, j-i);
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxCount;
	}

}
