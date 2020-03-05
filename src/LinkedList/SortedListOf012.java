package LinkedList;

public class SortedListOf012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(0);
		ll.insert(2);
		ll.insert(2);
		ll.insert(1);
		ll.insert(0);
		ll.insert(0);
		
		sortList(ll.head);
		
		ll.display();

	}

	private static void sortList(Node head) {
		// TODO Auto-generated method stub
		int [] count = {0,0,0};
		Node current = head;
		while(current != null) {
			count[current.data]++;
			current = current.next;
		}
		
		int i=0;
		current = head;
		
		while(current != null) {
			if(count[i] == 0) {
				i++;
			} else {
				current.data = i;
				count[i]--;
				current = current.next;
			}
		}
		
	}
	
	

}
