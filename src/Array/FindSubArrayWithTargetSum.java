package Array;
/*
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
 */
import java.util.Scanner;

public class FindSubArrayWithTargetSum {

		public static void main (String[] args) {
			//code
			
			Scanner in = new Scanner(System.in);
			
			int testcases = in.nextInt();
			
			for (int i = 0; i < testcases; i++) {
			    int size = in.nextInt();
			    int sum = in.nextInt();
			    
			    int arr[] = new int[size];
			    for (int j = 0; j < size; j++) {
			        arr[j] = in.nextInt();
			    } 
			    
			    subarraySum(arr, size, sum);
			}
		}
		
		private static int subarraySum(int arr[], int size, int targetSum) {
			 int start = 0, end =0, currentSum =0;
			    for(int i=0;i<=size;i++){
			        while(currentSum > targetSum && start<i){
			            currentSum = currentSum - arr[start];
			            start++;
			        }
			        if(currentSum == targetSum){
			            end = i-1;
			            start++;
			            end++;
			            System.out.println(start+" "+end);
			            return 1;
			        }
			        if(i< size){
			            currentSum = currentSum + arr[i];
			        }
			    }
			    System.out.println(-1);
			    return 0;
		}
}
