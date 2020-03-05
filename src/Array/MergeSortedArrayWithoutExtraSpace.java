package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortedArrayWithoutExtraSpace {

	public static void main(String[] args) throws IOException {
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
	
			for(int j=0;j<sizeA;j++) {
				A[j] = Integer.parseInt(inputA[j]);
			}
			
			for(int k=0;k<sizeB;k++) {
				B[k] = Integer.parseInt(inputB[k]);
			}
			
			
			
			mergeArray(A,B,sizeA,sizeB);
			System.out.println();
	}

}

	private static void mergeArray(int[] a, int[] b, int sizeA, int sizeB) {
		  for(int i = sizeB-1; i>=0;i--) {
			  int j;int last = a[sizeA-1];
			  for(j=sizeA-2;j>=0 && a[j]>b[i];j--) {
				   a[j+1] = a[j];
			  }
			  
			  if(j != sizeA-2 || last > b[i]) {
				  a[j+1] = b[i];
				  b[i] = last;
			  }
		  }
		  
		  for(int i=0;i<sizeA;i++) {
			  System.out.print(a[i]+" ");
		  }
		  for(int i=0;i<sizeB;i++) {
			  System.out.print(b[i]+" ");
		  }
	}
}
