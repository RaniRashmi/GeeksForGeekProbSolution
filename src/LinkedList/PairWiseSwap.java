package LinkedList;

public class PairWiseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll  = new LinkedList();
		ll.insert(6);
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		
		pairwiseSwap(ll.head);
		ll.display();

		
	}

	public static void pairwiseSwap(Node node) {
		Node current = node;
		while(current != null && current.next != null) {
			int temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;
			
			current = current.next.next;					
		}
	}
}
