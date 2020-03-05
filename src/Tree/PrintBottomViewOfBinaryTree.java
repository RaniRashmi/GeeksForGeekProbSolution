package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class PrintBottomViewOfBinaryTree {

	public static TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
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
		  bottomView(root);
		  displayView();

	}

	private static void bottomView(Node root) {
		bottomView(root,0);
	}

	private static void displayView() {
		// TODO Auto-generated method stub
		Set<Integer> keys = tmap.keySet();
		  for(Integer key : keys) {
		     System.out.print(tmap.get(key)+ " ");
		  }
	}

	private static void bottomView(Node root, int level) {
		Queue<QueueNode> queue = new LinkedList<>();
		queue.add(new QueueNode(level, root));
		while(!queue.isEmpty()) {
			QueueNode q = queue.remove();
			Node node = q.nodeLevel;
			int newLevel = q.level;
			
			tmap.put(newLevel,node.data);
			
			if(node.left != null) {
			    bottomView(node.left,newLevel-1);
			}
			if(node.right != null) {
				bottomView(node.right, newLevel+1);
			}
			
		}
		
	}

}

class QueueNode{
	int level;
	Node nodeLevel;
	
	public QueueNode(int level, Node nodeLevel) {
		this.level = level;
		this.nodeLevel = nodeLevel;
	}
	
}
