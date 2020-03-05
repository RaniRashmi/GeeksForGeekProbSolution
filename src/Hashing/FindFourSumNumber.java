package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindFourSumNumber {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int c = 0; c < t; c++) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] a = new int[n];
		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }
		    Set<String>tabu = new HashSet<>();
		    boolean found = false;
		    Arrays.sort(a);
		    for (int a1 = 0; a1 < n - 3; a1++)
		    for (int a2 = a1+1; a2 < n - 2; a2++)
		    for (int a3 = a2+1; a3 < n - 1; a3++)
		    for (int a4 = a3+1; a4 < n - 0; a4++) {
		        int sum = a[a1]+a[a2]+a[a3]+a[a4];
		        if (sum == k) {
		            found = true;
		            String out = a[a1]+" "+a[a2]+" "+a[a3]+" "+a[a4];
		            if (!tabu.contains(out)) {
		                tabu.add(out);
		                System.out.print(out +" $");
		            }
		        }
		    }
		    if (!found) System.out.println("-1");
		    else System.out.println();
		}
	}
}
