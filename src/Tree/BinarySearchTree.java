package Tree;

public class BinarySearchTree {
	
	public Node root;
	
	public void insert(int data) {
		root = insert(root,data);
	}

	private Node insert(Node node, int data) {
		// TODO Auto-generated method stub
		if(node == null) {
			node = new Node(data);
		} 
		
		if(data < node.data) {
			node.left = insert(node.left,data);
		} else if(data > node.data) {
			node.right = insert(node.right,data);
		}
		return node;
	}

	public void inorder() {
	  inorder(root);
    }
    public void inorder(Node node) {
	  if(node != null) {
		  inorder(node.left);
		  System.out.print(node.data+" ");
		  inorder(node.right);
	  }
    }
    
    public void preorder() {
    	preorder(root);
    }

	private void preorder(Node node) {
		if(node != null) {
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
		
	}
	
	
	public Node search(int data) {
		return search(root,data);
	}

	private Node search(Node node, int data) {
		if(node == null || node.data == data) {
			return node;
		}
		if(data < root.data) {
			return search(node.left,data);
		}
		return search(node.right,data);
	}

	public void deleteNodedata(int data) {
		// TODO Auto-generated method stub)
		root = deleteNodedata(root,data);
	}

	private Node deleteNodedata(Node node, int data) {
		// TODO Auto-generated method stub
		if(node == null) return node;
		if(data < node.data) {
			node.left = deleteNodedata(node.left,data);
		} else if(data > node.data){
			node.right = deleteNodedata(node.right,data);
		} else {
			//if deleted  node have one child
			if(node.left == null) {
				return node.right;
			} else if(node.right == null){
				return node.left;
			}
			
			//if deleted node have two children
			node.data = minValue(node.right);
			node.right = deleteNodedata(node.right,node.data);
		}
		return node;
	}

	private int minValue(Node node) {
		// TODO Auto-generated method stub
		int minValue = node.data;
		while(node.left != null) {
			minValue = node.left.data;
			node = node.left;
		}
		return minValue;
	}
   

}
