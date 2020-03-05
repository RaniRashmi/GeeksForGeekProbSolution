package Amazon;


public class MaximamNodeAndAncestorDifference {

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
        
        int x = maxDiff(root);
        System.out.println(x);
	}
    
 
	    static int m = Integer.MIN_VALUE;
	    static int maxDiff(Node node)
	    {
	    	if (node == null) return Integer.MAX_VALUE;
	        if(node.left==null && node.right == null) return node.data;
	        
	        int l = maxDiff(node.left);
	        int r = maxDiff(node.right);
	        
	        m = Math.max(m, node.data-Math.min(l,r));
	        return Math.min(node.data,Math.min(l,r));
	    }

}
