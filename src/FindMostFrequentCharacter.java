import java.util.Scanner;

public class FindMostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("most frequent character : "+mostFrequentCharacter(str));

	}

	private static String mostFrequentCharacter(String str) {
		// TODO Auto-generated method stub
		int [] count = new int[256];
		int len = str.length();
		for(int i=0;i<len;i++) {
			count[str.charAt(i)]++;
		}
		
		int max = -1;
		String result = "";
		
		for(int i=0;i<len;i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = String.valueOf(str.charAt(i));
			}
		}
		return result;
	}

}
