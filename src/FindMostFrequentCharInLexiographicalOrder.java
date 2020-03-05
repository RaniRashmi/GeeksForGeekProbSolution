import java.util.Scanner;

public class FindMostFrequentCharInLexiographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("most frequent character : "+mostFrequentCharacter(str));

	}

	private static char mostFrequentCharacter(String str) {
		// TODO Auto-generated method stub
		char [] charArray = str.toCharArray();
		int []count = new int[26];
		
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			if(charArray[i] != ' ') {
				count[charArray[i] - 'a']++;
			}
		}
		
		int max = -1;
		char result = ' ';
		for(int i=0;i< len;i++) {
		  if(max < count[i]) {
			  max = count[i];
			  result = (char)(i + 'a');
		  }
		}
		return result;
	}

}
