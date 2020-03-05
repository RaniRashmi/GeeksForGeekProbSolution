package VMWare;

import java.util.Scanner;

class Node{
	Node left, right;
	int data;
	public Node(int data) {
		this.data = data;
	}
}
public class ArrayToBalanceBST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		for(int i=0;i<noOfTestcases;i++) {
			int len = sc.nextInt();
			int [] arr = new int[len];
			for(int j=0;j<len;j++) {
				arr[j] = sc.nextInt();
			}
			Node node = convertArrayToBalancedBST(arr, 0, len-1);
			preorder(node);
			System.out.println();
	     }

   }

	private static void preorder(Node node) {
			if(node == null) {
				return;
			}
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);	
		
	}

	private static Node convertArrayToBalancedBST(int[] arr, int left, int right) {
		if(left > right) return null;
		int mid = (left+right)/2;
		Node node = new Node(arr[mid]);
		node.left = convertArrayToBalancedBST(arr, left, mid-1);
		node.right = convertArrayToBalancedBST(arr, mid+1, right);
		return node;
	}
}
