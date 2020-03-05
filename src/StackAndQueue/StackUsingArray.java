package StackAndQueue;

public class StackUsingArray {

	int max = 1000;
	int top;
	int [] arr = new int[max];
	
	public StackUsingArray() {
		top = -1;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	void push(int value) {
		if(top >= (max-1)) {
			System.out.print("stack overflow");
		} else {
			arr[++top] = value;
			System.out.println(value+ " pushed into stack");
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			int value = arr[top--];
			return value;
		}
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			int value = arr[top];
			return value;
		}
	}
	public static void main(String[] args) {
		    StackUsingArray s = new StackUsingArray(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println(s.pop() + " peek element of stack");
	}

}
