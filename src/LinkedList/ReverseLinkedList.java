package LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		
		ll.display();
		ll.head = reverseList(ll.head);
		ll.display();

	}

	private static Node reverseList(Node head) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node next = null;
		Node current = head;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
		
	}

}
