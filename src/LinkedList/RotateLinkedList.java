package LinkedList;

public class RotateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		
		ll.display();
		ll.head = rotateList(ll.head,3);
		ll.display();

	}

	private static Node rotateList(Node head, int k) {
		// TODO Auto-generated method stub
		int count=1;
		Node current = head;
		
		while(count < k && current != null) {
			current = current.next;
			count++;
		}
		
//		k is greater than or equal
		if(current == null){
            return head;
        }
		
		Node kthNode = current;
		while(current.next != null) {
			current = current.next;
		}
		
		
		current.next = head;
		head = kthNode.next;
		kthNode.next = null;
		
		return head;
	}

}
