package LinkedList;

public class DeleteNodeWithoutKnowingHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		Node d = ll.head;
		ll.insert(2);
		ll.insert(1);
		
	    deleteNode(d);
	    
	    
	    
	    ll.display();

	}

//	private static void insertNode(Node d) {
//		// TODO Auto-generated method stub
//		Node temp = new Node(10);
//		temp.next = d.next;
//		d.next = temp;
//		
//	}

	private static void deleteNode(Node d) {
		// TODO Auto-generated method stub
		Node temp = d.next;
		d.data = temp.data;
		d.next = temp.next;
		temp = null;
		
	}

}
