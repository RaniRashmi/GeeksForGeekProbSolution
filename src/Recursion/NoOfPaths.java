package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NoOfPaths {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		int noOfTestcases = sc.nextInt();
//		for(int i=0;i<noOfTestcases;i++) {
//			int size = sc.nextInt();
//			ArrayList<Integer> a = new ArrayList<Integer>();
//			for(int j=0;j<size;j++) {
//				a.add(sc.nextInt());
//			}
//			int b = sc.nextInt();
//			ArrayList<ArrayList<Integer>> result = findUniqueCominationSum(a,b);
//			for(int k=0;k<result.size();k++) {
//				System.out.print(result.get(k).toString().replace("[","(").replace("]", ")").replace(",", ""));
//			}
//		    System.out.println();	
//		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestcase = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestcase;i++) {
			int size = Integer.parseInt(br.readLine());
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<size;j++) {
				a.add(Integer.parseInt(br.readLine()));
			}
			int b = Integer.parseInt(br.readLine());
			ArrayList<ArrayList<Integer>> result = findUniqueCominationSum(a,b);
			for(int k=0;k<result.size();k++) {
				System.out.print(result.get(k).toString().replace("[","(").replace("]", ")").replace(",", ""));
			}
		    System.out.println();
		}
		
	}

	private static ArrayList<ArrayList<Integer>> findUniqueCominationSum(ArrayList<Integer> a, int b) {
	    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
	    if(a.size() ==0) {
	      return output;	
	    }
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    Collections.sort(a);
	    findUniqueCombinationUtil(a, b, output, temp, 0);
		return output;
	}

	private static void findUniqueCombinationUtil(ArrayList<Integer> a, int b, ArrayList<ArrayList<Integer>> output,
			ArrayList<Integer> temp, int index) {
		
		if(b<0) return;
		if(b == 0) {
			if(!output.contains(temp)){
				output.add(new ArrayList<>(temp));
			}
		} else {
			for(int i= index;i<a.size();i++) {
				temp.add(a.get(i));
				findUniqueCombinationUtil(a, b-a.get(i),output,temp,i+1);
				temp.remove(temp.size()-1);
			}
		}
		
		
	}

}
