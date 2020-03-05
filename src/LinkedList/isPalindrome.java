package LinkedList;

import java.util.Stack;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		
		ll.display();
		
		boolean flag = isPalindrome(ll.head);
		System.out.print(flag);

	}

	private static boolean isPalindrome(Node head) {
		// TODO Auto-generated method stub
		if(head == null) return false;
		if(head.next == null) return true;
		
		Stack<Integer> st = new Stack<Integer>();
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			st.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
//		for checking odd length
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			int data = st.pop();
			if(data != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

}
