package Tree;

public class maxDepthOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5);
        
        int max_depth = maxDepth(root);
        System.out.println(max_depth);
	}

	private static int maxDepth(Node root) {
		if(root == null) return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		if(leftDepth > rightDepth) {
			return leftDepth+1;
		} else {
		    return rightDepth+1;
		}
	}

}
