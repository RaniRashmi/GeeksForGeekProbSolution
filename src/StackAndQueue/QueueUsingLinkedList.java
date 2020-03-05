package StackAndQueue;

public class QueueUsingLinkedList {

	static class QNode { 
	    int value; 
	    QNode next; 
	  
	    // constructor to create a new linked list node 
	    public QNode(int value) 
	    { 
	        this.value = value; 
	        this.next = null; 
	    } 
	} 
	QNode front, rear; 
	public QueueUsingLinkedList() 
    { 
        this.front = this.rear = null; 
    } 
	
	public void enqueue(int value) {
		QNode node = new QNode(value);
		//check full condition
		if(rear == null) {
			rear = front = node;
			return;
		} 
		rear.next = node;
		rear = node;
	}
	
	public void dequeue() {
		if(front == null) {
			return ;
		}
		QNode node = front;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
	}
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList(); 
        q.enqueue(10); 
        q.enqueue(20); 
        System.out.println("Queue Front : " + q.front.value); 
        System.out.println("Queue Rear : " + q.rear.value); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        System.out.println("Queue Front : " + q.front.value); 
        System.out.println("Queue Rear : " + q.rear.value); 
	}

}
