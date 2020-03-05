package BitMagic;

import java.util.Scanner;

public class RightMostDifferentBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			getPositionOfRightMostDiffBit(n1, n2);
		}
	}

	private static void getPositionOfRightMostDiffBit(int n1, int n2) {
		int position = 1;
		if(n1 == n2) {
			System.out.println(-1);
		} else {
			while(n1 >0 || n2 >0) {
				if(n1%2 != n2%2) {
					break;
				} 
				position++;
				n1 = n1/2;
				n2 = n2/2;
			}
			System.out.println(position);
		}
	}

}
