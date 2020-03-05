package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodeAtSameLevel {

	public static void main(String[] args) {
		  Node root = new Node(1);
		  root.left = new Node(2);
		  root.right = new Node(3);
		  root.left.left = new Node(4);
		  root.left.right = new Node(5);
		  root.left.right.left = new Node(6);
		  root.left.right.right = new Node(7);
		  root.right.right = new Node(8);
		  
		  connectNodeAtSameLevel(root);
		  
		  System.out.println(("nextRight of "+ root.left.data+" is "+ 
			        ((root.left.nextRight != null) ? root.left.nextRight.data : -1)));
	}

	private static void connectNodeAtSameLevel(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()) {
			Node temp = queue.peek();
			queue.remove();
			
			if (temp != null) {
				temp.nextRight = queue.peek();
				if(temp.left != null) {
					queue.add(temp.left);
				}
				if(temp.right != null) {
					queue.add(temp.right);
				}
			} else if(!queue.isEmpty()) {
				queue.add(null);
			}
		}
	}

}
