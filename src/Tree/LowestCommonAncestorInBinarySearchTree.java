package Tree;

public class LowestCommonAncestorInBinarySearchTree {

	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree(); 
	        tree.root = new Node(20); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(22); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.right.left = new Node(10); 
	        tree.root.left.right.right = new Node(14); 
	   
	        int n1 = 10, n2 = 14; 
	        Node t = LCA(tree.root, n1, n2); 
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
	}

	private static Node LCA(Node node, int n1, int n2) {
			// TODO Auto-generated method stub
			if(node == null) return null;
			if(node.data > n1 && node.data > n2)
				return LCA(node.left,n1, n2);
			if(node.data < n1 && node.data < n2)
				return LCA(node.right,n1,n2);
			return node;
	}

}
