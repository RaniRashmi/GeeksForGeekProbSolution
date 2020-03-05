package Tree;

import java.util.Stack;

public class TreeTravesal {
	public Node root;
	public void insert(int data) {
		root = insert(root,data);
	}
	private Node insert(Node node, int data) {
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
//	without recursion
	public void inorder() {
		inorder(root);
	}
	private void inorder(Node node) {
	  if(node == null) return;
	  Stack<Node> st = new Stack<Node>();
	  Node current = node;
	  while(current != null || st.size()>0) {
		  while(current != null) {
			  st.push(current);
			  current= current.left;
		  }
		  current = st.pop();
		  System.out.print(current.data+" ");
		  current = current.right;
	  }
		
	}
	
	public void preorder() {
		preorder(root);
	}
	private void preorder(Node node) {
		if(node == null) return;
		Stack<Node> st = new Stack<Node>();
		st.push(node);
		while(!st.isEmpty()) {
			node = st.pop();
			System.out.print(node.data+" ");
			
			if(node.right != null) {
				st.push(node.right);
			}
			if(node.left != null) {
				st.push(node.left);
			}
		}
	}
	
	public void postorder() {
		postorder(root);
	}
	private void postorder(Node node) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		if(node == null) return;
		s1.push(node);
		while(!s1.empty()) {
			Node temp = s1.pop();
			s2.push(temp);
			if(temp.left != null) {
				s1.push(temp.left);
			}
			if(temp.right != null) {
				s1.push(temp.right);
			}	
		}
		while(!s2.isEmpty()) {
			System.out.print(s2.pop().data+" ");
		}
	}

}
