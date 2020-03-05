package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class printSpiralMatrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for(int i=0;i<noOfTestCases;i++) {
			int m=sc.nextInt();
		    int n=sc.nextInt();
		    
		    int[][] arr=new int[m][n];
		    
		    for(int j=0;j<m;j++){
		        for(int k=0;k<n;k++) {
		          arr[j][k]=sc.nextInt();
		        }
		    } 
		   spiralMatrix(arr,m,n);
		   System.out.println();
			
		}
		  sc.close();
	}

	private static void spiralMatrix(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub
		int i,k =0,l=0;
		while(k<m && l<n) {
	//		print top row
			for(i = l;i<n;i++) {
				System.out.print(arr[k][i]+" ");
			}
			k++;
	//		print last colom
			for(i=k;i<m;i++) {
				System.out.print(arr[i][n-1]+" ");
			}
			n--;
	//		print last row
			for(i=n-1;i>=l;i--) {
				System.out.print(arr[m-1][i]+" ");
			}
			m--;
	//		print forst colom
			for(i=m-1;i>=k;i--) {
				System.out.print(arr[i][l]+" ");
			}
			l++;
		}
	}
	
	

}
