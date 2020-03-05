package Tree;
/*
 * containing max nodes in a path of binary tree with root or without root
 */
public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		    Node root = new Node(1); 
	        root.left = new Node(2); 
	        root.right = new Node(3); 
	        root.left.left = new Node(4); 
	        root.left.right = new Node(5); 
	        
	        int diameter =  diameter(root);
	        System.out.print(diameter+" ");
	  
	}

	private static int diameter(Node root) {
		if(root == null) return 0;
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		int lDiameter = diameter(root.left);
		int rDiameter = diameter(root.right);
		
		
		return Math.max(lHeight+rHeight+1,Math.max(lDiameter, rDiameter));
	}

	private static int height(Node node) {
		if(node == null) return 0; 
		return 1 + Math.max(height(node.left), height(node.right));
	}

}
