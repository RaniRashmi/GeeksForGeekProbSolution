package Tree;

public class CheckBst {
    static Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =checkBst(root);
		System.out.print(x);

	}
	private static int checkBst(Node root) {
		// TODO Auto-generated method stub
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static int isBSTUtil(Node root, int min, int max) {
		// TODO Auto-generated method stub
		if(root == null) return 1;
		if (root.data < min || root.data > max) 
            return 0;
		
		return (isBSTUtil(root.left, min, root.data-1) & 
                isBSTUtil(root.right, root.data+1, max)); 
	}
	
	

}
