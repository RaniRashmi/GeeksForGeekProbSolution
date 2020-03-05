package Tree;

public class BinarySearchImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		
		bt.inorder();
		
		System.out.println();
		
		Node node = bt.search(2);
		System.out.println("search node: "+node.data);
		
		
		bt.deleteNodedata(3);
		
		System.out.println();
		
		bt.inorder();

	}

}
