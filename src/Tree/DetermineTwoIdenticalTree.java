package Tree;

public class DetermineTwoIdenticalTree {

	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        
        Node root1 = new Node(1); 
        root1.left = new Node(2); 
        root1.right = new Node(3); 
        root1.left.left = new Node(4); 
        root1.left.right = new Node(5); 
        root1.right.left = new Node(6); 
        root1.right.right = new Node(7); 
        root1.right.left.right = new Node(8); 
        root1.right.right.right = new Node(9); 
        
        
        boolean flag = isIdentical(root, root1);
        if(flag) {
        	System.out.println("1");
        } else {
        	System.out.println("0");
        }
	}

	private static boolean isIdentical(Node a, Node b) {
		if(a == null && b == null) return false;
		if(a != null && b!= null)
		  return (a.data == b.data 
				&& isIdentical(a.left,b.left)
				&& isIdentical(a.right, b.right));
		return false;
	}

}
