package LinkedList;

public class RemoveLoop {

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
        removeTheLoop(list.head);
        list.display();

	}

	public static void removeTheLoop(Node head) {
	    Node slow,fast;
	    slow=head;
	    fast=head;
	    if(head==null || head.next==null)
	    return;
	    while(slow!=null && fast!=null && fast.next!=null)
	    {
	        slow=slow.next;
	        fast=fast.next.next;
	        if(slow==fast)
	        {
	            fast=head;
	            while(fast.next!=slow.next)
	            {
	                fast=fast.next;
	                slow=slow.next;
	            }
	            slow.next=null;
	            return;
	        }
	    }
		}
}
