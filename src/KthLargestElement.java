import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int k = sc.nextInt();
		
		char output = kthLargestElement(str,k);
		System.out.println(" output : "+output);

	}

	private static char kthLargestElement(String str, int k) {
		// TODO Auto-generated method stub
		char [] strArray = str.toCharArray();
 		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : strArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry entry : map.entrySet()) {
			 System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
		List<Map.Entry> list = new ArrayList(map.entrySet());
		
		Collections.sort(list, new Comparator() {
			
			public int compare(Object o1, Object o2) {
				Integer v1 = (Integer)((Map.Entry)o1).getValue();
				Integer v2 = (Integer)((Map.Entry)o2).getValue();
				return v1.compareTo(v2);
			}
		});
		
		if(list.size() > k) return (char) (list.get(k)).getKey();
		return '1';
	}

}
