package StackAndQueue;

public class QueueUsingArray {

	int capacity;
	int front, rear, size;
	int [] arr;
	
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		front = size = 0;
		rear = capacity-1;
		arr = new int[ capacity];
	}
	
	public  boolean isFull(QueueUsingArray queue) {
	  return (queue.size == queue.capacity);
	}
	
	public boolean isEmpty(QueueUsingArray queue) {
		return queue.size ==0;
	}
	
	public void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		rear = (rear+1)%capacity;
		arr[rear]= item;
		size = size+1;
		System.out.println(item + " enque to queue ");
	}
	
	public int dequeue() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int item = arr[front];
		front = (front+1)%capacity;
		size = size-1;
		return item;
	}
	
	int front() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return arr[front];
	}
	
	int rear() {
		if(isFull(this)) {
			return Integer.MIN_VALUE;
		}
		return arr[rear];
	}
	public static void main(String[] args) {
	    QueueUsingArray queue = new QueueUsingArray(1000); 
        
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        
        System.out.println(queue.dequeue() +  
                     " dequeued from queue\n"); 
        
        System.out.println("Front item is " +  
                               queue.front()); 
           
        System.out.println("Rear item is " +  
                                queue.rear()); 
	}

}
