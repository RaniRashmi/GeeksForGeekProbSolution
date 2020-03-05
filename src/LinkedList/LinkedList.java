package LinkedList;

public class LinkedList {
	
	Node head = null;
	
//	insert a node
	public void insert(int value) {
		Node newNode = new Node(value);
		if(head != null) {
			newNode.next = head;
		}
		head = newNode;
	}
	
//	display a node
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
//	delete a node
	public Node delete(int value) {
		Node temp = head;
		if(head.data == value) {
			return head;
		}
		while(temp.next != null) {
			if(temp.next.data == value) {
				temp.next = temp.next.next;
				return head;
			}
			temp = temp.next;
		}
		return head;
	}
	
//	insert node from tail
	public void insertFromTail(int value) {
		Node newNode = new Node(value);
//		check for base case
		if(head == null) {
			newNode = new Node(value);
			return;
		}
		newNode.next = null;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}
	
	public void insertAfterGivenNode(Node givenNode, int value) {
		if(givenNode == null)return;
		Node newNode = new Node(value);
		newNode.next = givenNode.next;
		givenNode.next = newNode;
	}

}
