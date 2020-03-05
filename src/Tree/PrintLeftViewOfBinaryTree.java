package Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class PrintLeftViewOfBinaryTree {

	static TreeMap<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTree bt = new BinaryTree();
//		bt.insert(2);
//		bt.insert(3);
//		bt.insert(4);
//		bt.insert(5);
//		bt.insert(6);
//		bt.insert(7);
//		bt.insert(8);
		
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(12); 
        tree.root.left = new Node(10); 
        tree.root.left.left = new Node(5);
        tree.root.right = new Node(30); 
        tree.root.right.left = new Node(25); 
        tree.root.right.right = new Node(40);
		
		//bt.inorder(bt.root);
		//System.out.print(bt.root.data);
		
		leftView(tree.root);

	}

	private static void leftView(Node root) {
		// TODO Auto-generated method stub
		leftView(root,1);
		for(Map.Entry<Integer,Integer> entry : tmap.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
		
	}

	private static void leftView(Node root, int level) {
		if(root == null)
        {
            return;
        }
        if(!tmap.containsKey(level))
        {
            tmap.put(level,root.data);
        }
        System.out.println(level);
        leftView(root.left,level+1);
        leftView(root.right,level+1);
	}
	
	//second method
	private static void leftViewIterative(Node root) {
		 //second method
	        if(root == null) return;
	        Queue<Node> queue = new LinkedList<Node>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            for(int i=0;i<size;i++){
	                Node temp = queue.poll();
	                if( i==0){
	                  System.out.print(temp.data+" ");
	                }
	                if(temp.left != null){
	                    queue.add(temp.left);
	                }
	                if(temp.right != null){
	                    queue.add(temp.right);
	                }
	            }
	        }
	
    }

}
