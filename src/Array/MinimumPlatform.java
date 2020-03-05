package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumPlatform {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());
		for(int j=0;j< noOfTestCases;j++) {
			int size = Integer.parseInt(br.readLine());
			String [] arrivalTime = br.readLine().split(" ");
			String [] depatureTime = br.readLine().split(" ");
			int [] at = new int[size];
			int [] dt = new int[size];
			for(int i=0; i<size;i++) {
				at[i] = Integer.parseInt(arrivalTime[i]);
			}
			for(int i=0; i<size;i++) {
				dt[i] = Integer.parseInt(depatureTime[i]);
			}
			
			int minPlateform = findMinimumPlatform(at,dt,size);
			System.out.println(minPlateform);
		}

	}

	private static int findMinimumPlatform(int[] at, int[] dt, int size) {
		// TODO Auto-generated method stub
		int platformNeeded = 1, output =1;
		int i=1,j=0;
		Arrays.sort(at);
        Arrays.sort(dt);
		while(i<size && j<size) {
			if(at[i]<dt[j]) {
				platformNeeded++;
				i++;
				output = Math.max(output, platformNeeded);
			} else {
				platformNeeded--;
				j++;
			}
		}
		
		return output;
	}

}
