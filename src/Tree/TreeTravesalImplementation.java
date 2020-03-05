package Tree;

public class TreeTravesalImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTravesal bt = new TreeTravesal();
		bt.insert(1);
		bt.insert(2);
		bt.insert(4);
		bt.insert(5);
		bt.insert(3);
		
		bt.inorder();
		System.out.println();
		
		bt.preorder();
		System.out.println();
		
		bt.postorder();
		System.out.println();

	}

}
