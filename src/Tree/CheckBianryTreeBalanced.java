package Tree;

public class CheckBianryTreeBalanced {

	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5);
        
        boolean flag = isBalanced(root);
        if(flag) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}

	private static boolean isBalanced(Node node) {
		if(node == null) return true;
		int lHeight = height(node.left);
		int rHeight = height(node.right);
		
		if(Math.abs(lHeight -rHeight) <=1 
				&& isBalanced(node.left)
				&& isBalanced(node.right)) {
			return true;
		}
		return false;
	}
	
	private static int height(Node node) {
		if(node == null) return 0; 
		return 1 + Math.max(height(node.left), height(node.right));
	}

}
