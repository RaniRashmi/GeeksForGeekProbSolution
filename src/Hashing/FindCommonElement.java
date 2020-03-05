package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class FindCommonElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int t=Integer.parseInt(br.readLine()); 
	        while(t-->0){
	            String[] n=br.readLine().trim().split(" ");
	            int n1=Integer.parseInt(n[0]);
	            int n2=Integer.parseInt(n[1]);
	            int n3=Integer.parseInt(n[2]);
	            String[] a=br.readLine().trim().split(" ");
	            String[] b=br.readLine().trim().split(" ");
	            String[] c=br.readLine().trim().split(" ");
	            int i=0,j=0,k=0;
	            boolean flag=false;
	            StringBuilder sb=new StringBuilder(); 
	            HashSet<Integer> hs=new HashSet<Integer>();
	            while(i<n1 && j<n2 && k<n3){
	                int x=Integer.parseInt(a[i]);
	                int y=Integer.parseInt(b[j]);
	                int z=Integer.parseInt(c[k]);
	                if(x==y && y==z && z==x && !hs.contains(x)){
	                    hs.add(x);
	                    sb.append(x+" ");
	                    i++;
	                    j++;
	                    k++;
	                }
	                else if(x<y){
	                    i++;
	                }
	                else if(y<z){
	                    j++;
	                }
	                else{
	                    k++;
	                }
	            }
	            if(sb.toString().length()!=0){
	                System.out.println(sb.toString());
	            }
	            else{
	                System.out.println("-1");
	            }
	        }
	          
	}

}
