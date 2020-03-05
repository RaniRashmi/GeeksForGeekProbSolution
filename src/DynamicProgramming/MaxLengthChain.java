package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {

	class comparebyfirst implements Comparator<Pair>
    {
        public int compare(Pair a,Pair b)
        {
            return a.y-b.y;
        }
    }
    int maxChainLength(Pair arr[], int n)
    {
      Arrays.sort(arr,new comparebyfirst());
      int [] lis = new int[n];
      int i, j, max =0;
      
      for(i=0;i<n;i++){
          lis[i] =1;
      }
      for(i=1;i<n;i++){
          for(j=0;j<i;j++){
              if(arr[j].y < arr[i].x && lis[j]+1 > lis[i]){
                  lis[i] = lis[j]+1;
              }
          }
      }
      
      for(i=0;i<n;i++){
          if(max < lis[i]){
              max = lis[i];
          }
      }
      return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
