package StackAndQueue;

import java.util.Stack;



public class QueueUsingStack {

	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	public QueueUsingStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack qs = new QueueUsingStack();
		qs.enqueue(1);
		qs.enqueue(2);
		qs.enqueue(3);
		qs.enqueue(4);
		
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());

	}

	
	private void enqueue(int value) {
		// TODO Auto-generated method stub
//		put all element from s1 to s2
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(value);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	private int dequeue() {
		// TODO Auto-generated method stub
		if(s1.isEmpty()) {
			return -1;
		}
		int x = s1.peek();
		s1.pop();
		return x;
	}


}
