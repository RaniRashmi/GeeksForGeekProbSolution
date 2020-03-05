package StackAndQueue;

import java.util.Stack;

import src.Integer;

public class StackMin extends Stack<Integer>{

	Stack<Integer> st = new Stack<Integer>();
	public static void main(String[] args) {
		    StackMin s = new StackMin(); 
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        System.out.println(s.min()); 
	        s.push(5); 
	        System.out.println(s.min()); 
	}

	private void push(int value) {
		if(value < min()) {
			st.push(value);
		}
		super.push(value);
	}

	private int min() {
		if(st.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return st.peek();
	}
	
	public Integer pop() {
		int value = super.pop();
		if(value == min()) {
			st.pop();
		}
		return value;
	}

}
