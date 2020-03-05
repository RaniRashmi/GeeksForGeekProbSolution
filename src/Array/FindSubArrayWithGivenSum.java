package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindSubArrayWithGivenSum {

	public static int SumCheck(int arr[],int n,int sum)
	{
			int Csum=arr[0],start=0;
			for(int i=1;i<=n;i++)
			{
				while(Csum>sum && start<i)
				{
					Csum=Csum-arr[start];
					start++;
				}
				if(Csum==sum)
				{
					System.out.println((start+1)+" "+(i));
					return 1;
				}
				if(i<n)
				{
					Csum+=arr[i];
				}
			}
			return 0;
	}	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String get=br.readLine();
			String getarr[]=get.trim().split("\\s+");
			int n=Integer.parseInt(getarr[0]);
			int sum=Integer.parseInt(getarr[1]);
			String input=br.readLine();
			String inputarr[]=input.trim().split("\\s+");
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(inputarr[i]);
			int a=SumCheck(arr,n,sum);	
			if(a==0)
				System.out.println("-1");
		}
	}

}
