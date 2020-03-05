package LinkedList;
/*
 * Input: List1: 7->5->9->4->6  // represents number 64957
       List2: 8->4 //  represents number 48
Output: Resultant list: 5->0->0->5->6  // represents number 65005
 */
public class SumTwoLinkedList {

	static Node head1, head2; 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumTwoLinkedList list = new SumTwoLinkedList(); 
		  
        // creating first list 
        list.head1 = new Node(7); 
        list.head1.next = new Node(5); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(4); 
        list.head1.next.next.next.next = new Node(6); 
        System.out.print("First List is "); 
        list.printList(head1); 
  
        // creating seconnd list 
        list.head2 = new Node(8); 
        list.head2.next = new Node(4); 
        System.out.print("Second List is "); 
        list.printList(head2); 
  
        // add the two lists and see the result 
        Node rs = list.addTwoLists(head1, head2); 
        System.out.print("Resultant List is "); 
        list.printList(rs); 

	}

	private Node addTwoLists(Node first, Node second) {
		Node head = null, prev = null, temp = null; int carry =0, sum =0;
		while(first != null || second != null) {
			sum = sum + (first != null ? first.data : 0)
					  + (second != null ? second.data : 0);
			carry = sum >= 10 ? 1:0;
			sum = sum%10;
			temp = new Node(sum);
			if(head == null) {
				head = temp;
			} else {
				prev.next = temp;
			}
			
			prev = temp;
			if(first != null) {
				first = first.next;
			}
			if(second != null) {
				second = second.next;
			}
			
			if(carry > 0) {
				temp.next = new Node(carry);
			}
			
		}
		return head;
	}

	private void printList(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		 System.out.println(""); 
	}

}
