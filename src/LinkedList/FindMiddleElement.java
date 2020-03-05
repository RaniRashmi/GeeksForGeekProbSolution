package LinkedList;

public class FindMiddleElement {

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
		int middleElement = findMiddleElement(ll.head);
		System.out.println(middleElement);
	}

	private static int findMiddleElement(Node head) {
		// TODO Auto-generated method stub
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}

}
