package LinkedList;

public class GetNthFromLastInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(5);
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		
		ll.display();
		int nthNode = getNthNodeFromLast(ll.head,2);
		System.out.print(nthNode);

	}

	private static int getNthNodeFromLast(Node head, int n) {
		int count=0;
		Node slow=head,fast=head;
		while(fast!= null){
			if(count>=n)
			slow=slow.next;
			fast=fast.next;
			count++;
		}
		if(n<=count)
		 return slow.data;
		else
		 return -1;
		
	}

//	private static int getNthNodeFromLast(Node head, int n) {
//		// TODO Auto-generated method stub
//		Node fast = head;
//		Node slow = head;
//		int count =0;
//		for(int i=0;i<n;i++) {
//			fast = fast.next;
//			count++;
//		}
//		
//		while(fast != null) {
//			fast = fast.next;
//			slow = slow.next;
//		}
//		if(n <= count)
//		 return slow.data;
//		return -1;
//	}
//	
//	

}
