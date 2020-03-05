import java.util.Scanner;

public class PositionOfRightMostSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int n = sc.nextInt();
		    findFirstSetBit(n);
		}
	}

	// this operation is taking time
	
	private static void findFirstSetBit(int n) {
		int position =1;
		if(n == 0) {
			System.out.println(0);
		} else {
			while(n > 0) {
				if((n&1) == 1) {
					System.out.println(position);
					break;
				}
				n = n>>1;
				position++;
			}
		}
		
	}

}
