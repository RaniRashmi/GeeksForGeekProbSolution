import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoreQuestionOnString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			String [] strArr = new String[n];
			for(int j=0;j<n;j++) {
				strArr[j] = sc.next();
			}
			String str  = getFrequentWord(strArr,n);
			System.out.println(str);
		}
	}

	private static String getFrequentWord(String[] strArr, int n) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(strArr[i])) {
				map.put(strArr[i], map.get(strArr[i])+1);
			} else {
				map.put(strArr[i], 1);
			}
		}
		
		int value =0;
		String key = " ";
		for(Map.Entry<String, Integer> word : map.entrySet()) {
			if(word.getValue()>value) {
				value = word.getValue();
				key = word.getKey();
			} else if(word.getValue() == value) {
				if(word.getKey().compareTo(key) < 0) {
					key = word.getKey();
				}
			}
		}
		
		return key;
	}

}
