package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxCapacityUtilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		
		map1.put(1, 3);
		map1.put(2, 5);
		map1.put(3, 7);
		map1.put(4,10);
		
		map2.put(1, 2);
		map2.put(2, 3);
		map2.put(3, 4);
		map2.put(4, 5);
		
		for (Entry<Integer, Integer> entry : map1.entrySet()) {
			System.out.print("("+entry.getKey()+" , "+entry.getValue()+")"+" ");
		}
		
		System.out.println();
		
		for (Entry<Integer, Integer> entry : map2.entrySet()) {
			System.out.print("("+entry.getKey()+" , "+entry.getValue()+")"+" ");
		}
		
		int max_capacity = 10;
		
		int max_sum = Integer.MIN_VALUE;
		System.out.println();
		for(Entry<Integer, Integer> entry1 : map1.entrySet()) {
			for(Entry<Integer, Integer> entry2 : map2.entrySet()) {
				if(entry1.getValue()+entry2.getValue() == max_capacity) {
					System.out.println(entry1.getKey()+","+entry2.getKey());
				} else if(entry1.getValue()+entry2.getValue() < max_capacity) {
					
				}
				
			}
		}
	}

}
