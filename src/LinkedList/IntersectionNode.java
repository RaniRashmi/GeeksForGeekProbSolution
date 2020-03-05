package LinkedList;



public class IntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(7);
		l1.insert(9);
		l1.insert(5);
		l1.insert(1);
		l1.insert(3);
		
		LinkedList l2 = new LinkedList();
		l2.insert(1);
		l2.insert(2);
		l2.insert(7);
		l2.insert(6);
		l2.insert(4);
		
		System.out.println("l1.head : "+l1.head.data);
		System.out.println("l1.head : "+l2.head.data);
		int value = getNode(l1.head,l2.head);
		System.out.println(" intersecting node is : "+value);
	}

	private static int getNode(Node headA, Node headB) {
		// TODO Auto-generated method stub
		int c1 = getCount(headA);
		int c2 = getCount(headB);
		int difference = 0;
		if(c1>c2) {
			difference = c1-c2;
			return getInsertionNode(difference, headA, headB);
		} else {
			difference = c2-c1;
			return getInsertionNode(difference, headB,headA);
		}
	}

	private static int getInsertionNode(int difference, Node headA, Node headB) {
		// TODO Auto-generated method stub
		Node currentA = headA;
		Node currentB = headB;
		
		for(int i =0;i<difference;i++) {
			if(currentA == null) {
			 return -1;
			}
			currentA = currentA.next;
		}
		
		while(currentA != null && currentB != null) {
			if(currentA.data == currentB.data) {
				return currentA.data;
			}
			currentA = currentA.next;
			currentB = currentB.next;
		}
		return -1;
	}

	private static int getCount(Node head) {
		// TODO Auto-generated method stub
		int count =0;
		Node current = head;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

}
