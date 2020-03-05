package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeTwoSortedArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int i =0;i<noOfTestCases;i++) {
			String [] arrSizes = br.readLine().split(" ");
			int sizeA = Integer.parseInt(arrSizes[0]);
			int sizeB = Integer.parseInt(arrSizes[1]);
			
			int [] A = new int[sizeA];
			String [] inputA = br.readLine().split(" ");
			int [] B = new int[sizeB];
			String [] inputB = br.readLine().split(" ");
			int sizeAB = sizeA+sizeB-1;
			for(int j=0;j<=sizeAB;j++) {
				A[j] = Integer.parseInt(inputA[j]);
			}
			
			for(int k=0;k<sizeB;k++) {
				B[k] = Integer.parseInt(inputB[k]);
			}
			
			
			
			String str = mergeArray(A,B,sizeA,sizeB);
			System.out.print(str); 
		}
		
		

	}

	private static String mergeArray(int[] a, int[] b, int sizeA, int sizeB) {
		StringBuilder sb = new StringBuilder();
		int i=0,j=0;
		while(i< sizeA && j< sizeB) {
			if(a[i]<b[j]) {
				sb.append(a[i]+ " ");
				i++;
			} else {
				sb.append(b[j]+" ");
				j++;
			}
		}
		
		while(i<sizeA) {
			sb.append(a[i]+" ");
			i++;
		}
		while(j<sizeB) {
			sb.append(b[j]+" ");
			j++;
		}
		
		return sb.toString();
	}

	private static void printArray(int[] A, int sizeAB) {
		// TODO Auto-generated method stub
		for(int i=0;i<sizeAB;i++) {
			System.out.println(A[i]+" ");
		}
		System.out.println();
	}

//	private static void mergeArray(int[] A, int[] B, int sizeA, int sizeB) {
//		// TODO Auto-generated method stub
//		int i = sizeA-1;
//		int j = sizeB-1;
//		int sizeAB = sizeA +sizeB -1;
//		
//		while(j >=0) {
//			if(i >=0 && A[i]>B[j]) {
//				A[sizeAB] = A[i];
//				i--;
//			} else {
//				A[sizeAB] = B[j];
//				j--;
//			}
//			sizeAB--;
//		}
//		
//	}

}
