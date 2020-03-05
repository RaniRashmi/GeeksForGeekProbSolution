package Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class PrintBinaryTreeInVerticalOrder {
    static class Node{
    	int data;
    	Node left , right;
    	Node(int data){
    		this.data = data;
    		left = right = null;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        System.out.println("Vertical Order traversal is"); 
        verticalOrder(root); 

	}
	private static void verticalOrder(Node node) {
	    HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
	    getVerticalOrder(node,map);
	
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(Collection<Integer> c :map.values()) {
	    	list.addAll(c);
	    }
	    for(int i=0;i<list.size();i++) {
	    	System.out.print(list.get(i)+" ");
	    }
	}
	private static void getVerticalOrder(Node node, HashMap<Integer, ArrayList<Integer>> map) {
		if(node == null) return;
		
		LinkedList<Node> q1 = new LinkedList<>();
	    LinkedList<Integer> q2 = new LinkedList<>();
	    q1.offer(node);
	    q2.offer(0);
	 
	    while (!q1.isEmpty()) {
	        Node newNode = q1.poll();
	        int order = q2.poll();
	        
		ArrayList<Integer> getItem = map.get(order);
		
		if(getItem == null) {
			getItem = new ArrayList<>();
            map.put(order, getItem);
		} 
		getItem.add(newNode.data);
	
		if (newNode.left != null) {
            q1.offer(newNode.left);
            q2.offer(order - 1);
        }
 
        if (newNode.right != null) {
            q1.offer(newNode.right);
            q2.offer(order + 1);
        }
	    }
	}

}
