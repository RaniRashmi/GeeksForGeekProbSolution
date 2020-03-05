package Tree;

public class FindMaxSum {

	public static void main(String[] args) {
		Node root = new Node(10); 
        root.left = new Node(2); 
        root.right = new Node(10); 
        root.left.left = new Node(20); 
        root.left.right = new Node(1); 
        root.right.right = new Node(-25); 
        root.right.right.left = new Node(3); 
        root.right.right.right = new Node(4); 
        
        
        int sum = findMaxSum(root, Integer.MIN_VALUE);
        System.out.println(sum);
	}

	private static int findMaxSum(Node root, int maxValue) {
		 if(root == null) return 0;
	        int left = findMaxSum(root.left, maxValue);
	        int right = findMaxSum(root.right, maxValue);
	        
	        int current = Math.max(root.data,Math.max(root.data+left,root.data+right));
	        maxValue = Math.max(maxValue,Math.max(current,left+root.data+right));
	        
	        return current;
	}

}
