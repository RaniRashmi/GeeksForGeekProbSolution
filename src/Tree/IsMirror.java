package Tree;

public class IsMirror {

	public static void main(String[] args) {
		Node root= new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(2); 
        root.left.left = new Node(3); 
        root.left.right = new Node(4); 
        root.right.left = new Node(4); 
        root.right.right = new Node(3); 
        
        boolean flag = isMirror(root, root);
        if(flag) {
        	System.out.println("1");
        } else {
        	System.out.println("0");
        }
	}

	private static boolean isMirror(Node root1, Node root2) {
		if(root1 == null && root2 == null) return true;
		if(root1 != null && root2 != null && root1.data == root2.data) {
			return (isMirror(root1.left, root2.right)
					&& isMirror(root1.right, root2.left));
		}
		return false;
	}

}
