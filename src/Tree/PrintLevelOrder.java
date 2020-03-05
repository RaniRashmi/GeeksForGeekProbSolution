package Tree;

import java.util.LinkedList;
import java.util.Queue;

//BFS
public class PrintLevelOrder {

	Node root; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		  root.left = new Node(2);
		  root.right = new Node(3);
		  root.left.left = new Node(4);
		  root.left.right = new Node(5);
		  root.left.right.left = new Node(6);
		  root.left.right.right = new Node(7);
		  root.right.right = new Node(8);
	        
	        printLevelOrder(root);

	}

	private static void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data+ " ");
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

}
