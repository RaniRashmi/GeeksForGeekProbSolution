package LinkedList;


public class LoopSetectionInCircularList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList list = new LinkedList(); 
	        list.head = new Node(50); 
	        list.head.next = new Node(20); 
	        list.head.next.next = new Node(15); 
	        list.head.next.next.next = new Node(4); 
	        list.head.next.next.next.next = new Node(10); 
	  
	        // Creating a loop for testing  
	        list.head.next.next.next.next.next = list.head.next.next; 
	        
		boolean flag = isLoop(list.head);
        System.out.println(flag);
	}

	private static boolean isLoop(Node head) {
		// TODO Auto-generated method stub
		Node fast = head;
		Node slow = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		
		if(fast == null || fast.next == null)
		    return false;
		return true;
	}

}
