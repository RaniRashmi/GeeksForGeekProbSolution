import java.util.Scanner;

public class VMWare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int len = sc.nextInt();
			int [] arr = new int[len];
			for(int j=0;j<len;j++) {
				arr[j] = sc.nextInt();
			}
			int maxDiff = findMaxDiff(arr, len);
			System.out.println(maxDiff);
		}
	}

	private static int findMaxDiff(int[] arr, int n) {
		int [] Lmin = new int[n];
		int [] Rmax = new int[n];
		
		Lmin[0] = arr[0];
		Rmax[n-1] = arr[n-1];
		
		int i,j;
		
		for(i=1;i<n;i++) {
			Lmin[i] = Math.min(arr[i], Lmin[i-1]);
		}
		
		for(j=n-2;j>=0;j--) {
			Rmax[j] = Math.max(arr[j], Rmax[j+1]);
		}
		
		i=0; j=0;
		int maxDiff = 0;
		
		while(j <n && i<n) {
			if(Lmin[i] < Rmax[j]) {
				maxDiff = Math.max(maxDiff, j-i);
				j++;
			} else {
				i++;
			}
		}
		return maxDiff;
	}

	//this is for element difference
//	private static int findMaxDiff(int[] arr, int len) {
//		int maxDiff = arr[1] - arr[0];
//		int minElem = arr[0];
//		
//		for(int i=1;i< len;i++) {
//			if((arr[i]-minElem)>maxDiff) {
//				maxDiff = arr[i]-minElem;
//			}
//			if(minElem > arr[i]) {
//				minElem = arr[i];
//			}
//		}
//		return maxDiff;
//	}

}
