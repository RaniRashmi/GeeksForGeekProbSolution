package Recursion;

import java.util.Scanner;

public class FloodFill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nofOfTestcases = sc.nextInt();
		for(int i=0;i<nofOfTestcases;i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int [][] matrix = new int[m][n];
			for(int j=0;j<m;j++) {
				for(int k=0;k<n;k++) {
					matrix[j][k] = sc.nextInt();
				}
			}
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int newC = sc.nextInt();
			
			fillColor(matrix,x, y,m, n, newC);
			
			for (int p = 0; p < m; p++) 
		    { 
		        for (int q = 0; q < n; q++) 
		        System.out.print(matrix[p][q] + " "); 
		        System.out.println();  
		    } 
		}
	}

	private static void fillColor(int[][] matrix, int x, int y,int m, int n, int newC) {
		int prevC = matrix[x][y];
		fillColorUtil(matrix, x, y,m,n, prevC, newC);
	}

	private static void fillColorUtil(int[][] matrix, int x, int y, int m, int n, int prevC, int newC) {
		if(x <0 || x>= m || y<0 || y>=n) return;
		if(matrix[x][y] != prevC) {
			return;
		}
		matrix[x][y] = newC;
		fillColorUtil(matrix, x+1, y, m, n, prevC, newC);
		fillColorUtil(matrix, x-1, y, m, n, prevC, newC);
		fillColorUtil(matrix, x, y+1, m, n, prevC, newC);
		fillColorUtil(matrix, x, y-1, m, n, prevC, newC);
		
	}

}
