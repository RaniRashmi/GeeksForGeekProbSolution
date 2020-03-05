package BitMagic;

import java.util.Scanner;

public class SetKthBitOfANum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			setKthBit(n, k);
		}
	}

	private static void setKthBit(int n, int k) {
		System.out.println(( (1 << k) | n));
	}

}
