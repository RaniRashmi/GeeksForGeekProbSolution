package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public StackUsingQueue() {
    	q1 = new LinkedList<Integer>();
    	q2 = new LinkedList<Integer>();
    }
	public static void main(String[] args) {
		StackUsingQueue q = new StackUsingQueue();
		q.enque(1);
		q.enque(5);
		q.enque(3);
		
		System.out.println("removed item : " +q.dequeue());
	}
	
	private void enque(int value) {
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(value);
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
		}
	}
	private int dequeue() {
		if(q1.isEmpty()) {
			return -1;
		}
		int value = q1.remove();
		return value;
	}
	

}
