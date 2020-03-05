package Tree;

public class CountLeaves {

	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5);
        
        int countLeaves = countLeaves(root);
        System.out.println(countLeaves);
	}

	private static int countLeaves(Node root) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;
		return countLeaves(root.left)+countLeaves(root.right);
	}

}
