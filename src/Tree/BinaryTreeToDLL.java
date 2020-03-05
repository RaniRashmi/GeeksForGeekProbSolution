package Tree;

public class BinaryTreeToDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree(); 
		   
        // Let us create the tree shown in above diagram 
        tree.root = new Node(10); 
        tree.root.left = new Node(12); 
        tree.root.right = new Node(15); 
        tree.root.left.left = new Node(25); 
        tree.root.left.right = new Node(30); 
        tree.root.right.left = new Node(36); 
        
        Node head = convertBTtoDLL(tree.root);
        printList(head);
        

	}

	private static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.right;
		}
	}

	private static Node convertBTtoDLL(Node node) {
		if(node == null) return node;
		node = convertBTtoDLLUtil(node);
		while(node.left != null) {
			node = node.left;
		}
		
		return node;
	}

	private static Node convertBTtoDLLUtil(Node node) {
		if(node == null) return node;
		if(node.left != null) {
			Node left = convertBTtoDLLUtil(node.left);
			while(left.right != null) {
				left = left.right;
			}
			left.right = node;
			node.left = left; 
		}
		
		if(node.right != null) {
			Node right = convertBTtoDLLUtil(node.right);
			while(right.left != null) {
				right = right.left;
			}
			
			right.left = node;
			node.right = right;
		}
		return node;
	}

}
