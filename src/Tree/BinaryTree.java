package Tree;

public class BinaryTree {
  public Node root;
  public BinaryTree() {
	  root = null;
  }
  public void insert(int data) {
	  root =  insert(root,data);
  }
  private Node insert(Node node, int data) {
	    if(node == null) {
	    	node = new Node(data);
	    } else {
	    	if(node.right == null) {
	    		node.right = insert(node.right,data);
	    	} else {
	    		node.left = insert(node.left,data);
	    	}
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
   
  public int countNodes() {
	  return countNodes(root);
  }
  private int countNodes(Node node) {
		// TODO Auto-generated method stub
	  if(node == null) 
		  return 0;
	  else {
		  int count =1;
		  count += countNodes(node.left);
		  count += countNodes(node.right);
		  return count;
	  }
  }
  public boolean search(int data) {
	  return search(root,data);
  }
   public boolean search(Node root, int data) {
		// TODO Auto-generated method stub
		if(root.data == data) 
			  return true;
		if(root.left != null) {
			if(search(root.left,data)) {
				return true;
			}
		}
		if(root.right != null) {
			if(search(root.right,data)) {
				return true;
			}
		}

		return false;
  }

	  
  
}
