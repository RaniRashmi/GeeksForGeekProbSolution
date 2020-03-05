package Tree;

public class BinaryTreeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		
		bt.inorder();
		
		int count = bt.countNodes();
		System.out.println();
		System.out.print("no of nodes in a binary tree : "+count);
		
		System.out.println();
		
		boolean flag = bt.search(2);
		System.out.print(flag);

	}

}
