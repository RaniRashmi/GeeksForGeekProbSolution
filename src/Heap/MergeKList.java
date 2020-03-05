package Heap;
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
public class MergeKList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    Node mergeKList(Node[]a,int N)
    {
       for(int i=1;i<N;i++){
           a[i] = merge(a[i], a[i-1]);
       }
       return a[N-1];
    }
    
    Node merge(Node A, Node B){
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

}
