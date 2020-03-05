package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FindTheFine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for(int i=0;i<noOfTestCases;i++) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int [] car_num = new int[n];
			int [] panelty = new int[n];
			
			for(int j=0;j<n;j++) {
				car_num[j] = sc.nextInt();
			}
			for(int k=0;k<n;k++) {
				panelty[k] = sc.nextInt();
			}
			
			findPanelty(car_num,panelty,n,d);
		}
	}

	private static void findPanelty(int[] car_num, int[] panelty, int n, int d) {
		int sum =0;
		 if(d%2==0){
		        for(int i=0;i<n;i++){
		            if(car_num[i]%2 != 0){
		                sum+=panelty[i];
		            }
		        }
		    }else{
		        for(int i=0;i<n;i++){
		            if(car_num[i]%2 == 0){
		                sum+=panelty[i];
		            }
		        }
		    }
		 System.out.println(sum);
	}

}
