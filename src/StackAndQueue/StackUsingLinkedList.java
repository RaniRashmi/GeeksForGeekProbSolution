package StackAndQueue;

public class StackUsingLinkedList {
	StackNode root;
    static class StackNode{
    	int data;
    	StackNode next;
    	public StackNode(int data) {
    		this.data = data;
    	}
    }
    
    public boolean isEmpty() {
    	return (root == null);
    }
    
    public void push(int value) {
    	StackNode newNode = new StackNode(value);
    	if(root == null) {
    		root = newNode;
    	} else {
    		StackNode temp = root;
    		root = newNode;
    		newNode.next = temp;
    	}
    	System.out.println(value + " pushed into stack");
    }
    
    public int pop() {
    	int popped = Integer.MIN_VALUE;
    	if(root == null) {
    		System.out.println("Stack is empty");
    	} else {
    		popped = root.data;
    		root = root.next;
    	}
    	return popped;
    }
    
    public int peek() {
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	} else {
    		return root.data;
    	}
    }
    
	public static void main(String[] args) {
		StackUsingLinkedList sll = new StackUsingLinkedList(); 
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
	}

}
