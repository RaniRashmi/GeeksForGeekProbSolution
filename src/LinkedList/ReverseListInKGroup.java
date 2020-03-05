package LinkedList;

public class ReverseListInKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		
		ll.display();
		ll.head = reverseListInGroup(ll.head,2);
		ll.display();
	}

	private static Node reverseListInGroup(Node head, int k) {
		// TODO Auto-generated method stub
		int count =0;
		Node prev = null;
		Node next = null;
		Node current = head;
		
		while(count<k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		
		if(next != null) {
		head.next = reverseListInGroup(next,k);
		}
		return prev;
	}

}
