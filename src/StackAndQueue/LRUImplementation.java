package StackAndQueue;

import java.util.HashMap;
import java.util.Map;


public class LRUImplementation {

	class Node{
		int key;
		int value;
		Node prev, next;
		public Node(int key , int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public static Map<Integer, Node> map;
	Node start , end;
	int capacity;
	
	public LRUImplementation(int capacity) {
	  map =  new HashMap<Integer,Node>();
	  start = new Node(0,0);
	  end = new Node(0,0);
	  this.capacity = capacity;
	}
	
	public void removeNode(Node node) {
		Node temp = node.next;
		node.prev.next = temp;
		temp.prev = node.prev;
	}
	
	public void addNode(Node node) {
		node.next = start.next;
		start.next = node;
		node.prev = start;
		node.next.prev = node;
	}
	
	public int get(int key) {
		if(map.containsKey(key)) {
			Node node = map.get(key);
			removeNode(node);
			addNode(node);
			return node.value;
		}
		return -1;
	}
	
	public void set(int key, int value) {
		Node node = new Node(key,value);	
		if(map.containsKey(key)) {
			Node temp = map.get(key);
			removeNode(temp);
			addNode(node);
		} else {
			if(capacity == map.size()) {
				Node temp = end.prev;
				removeNode(temp);
				map.remove(temp.key);
			}
		}
		addNode(node);
		map.put(key, node);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUImplementation obj = new LRUImplementation(5);
		 obj.set(1,1);
		 obj.set(2,3);
		 obj.set(3,4);
		 obj.set(6,10);
		 obj.get(1);
		 obj.get(3);
		 obj.set(1,5);
		 obj.set(12, 7);
		 obj.set(5, 2);

	}

}
