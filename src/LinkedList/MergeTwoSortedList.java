package LinkedList;

public class MergeTwoSortedList {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.insert(9);
		ll.insert(7);
		ll.insert(5);
		ll.insert(3);
		ll.insert(1);
		
		LinkedList l2 = new LinkedList();
		l2.insert(10);
		l2.insert(8);
		l2.insert(6);
		l2.insert(4);
		l2.insert(2);
		
		ll.head = sortedMerge(ll.head,l2.head);
		ll.display();
	}

	private static Node sortedMerge(Node A, Node B) {
		if(A == null) return B;
		if(B == null) return A;
		
	    Node head = new Node(0);
	    Node current = head;
		while(A != null && B != null) {
			if(A.data < B.data) {
				current.next = A;
				A = A.next;
			} else {
				current.next = B;
				B = B.next;
			}
			current = current.next;
		}
		
		if(A != null) {
			current.next = A;
		}
		
		if(B != null) {
			current.next = B;
		}
		return head.next;
	}
	
//	static Node sortedMerge(Node headA, Node headB) {
//	     // This is a "method-only" submission. 
//	     // You only need to complete this method
//	     if(headA == null) return headB;
//	     if(headB == null) return headA;
//	     
//	     if(headA.data < headB.data){
//	          headA.next = sortedMerge(headA.next,headB);
//	          return headA;
//	     } else{
//	          headB.next = sortedMerge(headA, headB.next);
//	          return headB;
//	     }
//	     
//	   }

}
