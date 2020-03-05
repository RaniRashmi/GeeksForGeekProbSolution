package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class ZeroSubArraySum {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t-- >0){
			    int n=s.nextInt();
			    int[] a=new int[n];
			    HashMap<Integer,Integer> hm=new HashMap();
			    
			    for(int i=0;i<n;i++){
			        a[i]=s.nextInt();
			    }
			    int sum=0,count=0;
			    hm.put(0,1);
			    for(int i=0;i<n;i++){
			        sum+=a[i];
			        if(hm.containsKey(sum)){
			        count+=hm.get(sum);
			        hm.put(sum,hm.get(sum)+1);
			        }
			        else
			        hm.put(sum,1);
			        
			    }
			    System.out.println(count);
			}
		}
}
