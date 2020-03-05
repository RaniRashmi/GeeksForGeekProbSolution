package Array;

public class ShiftAllNonZeroAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,0,1,3,2,6,8,0,4,5,0,0};
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			arr[count++] = arr[i];
			}
		}
		while(count< arr.length) {
			arr[count++] = 0;
		}
		
		for(int i=0;i< arr.length;i++) {
		 System.out.print(arr[i]+ " ");
		}

	}

}
