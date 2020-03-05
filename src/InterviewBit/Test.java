package InterviewBit;

public class Test {

	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 10 || x==20 || x==30  || x==50) {
	            x++;
	         } else {
	        	 continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	   }
}