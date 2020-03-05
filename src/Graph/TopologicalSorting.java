package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSorting {
    
	 
	int V;
	LinkedList<Integer> adj[];
	public TopologicalSorting(int noOfVertex) {
		V = noOfVertex;
	    adj = new LinkedList[V];
	    for(int i=0;i<V;i++) {
	    	adj[i] = new LinkedList();
	    }
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
	public static void main(String[] args) {
		    TopologicalSorting g = new TopologicalSorting(6); 
	        g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
	  
	        System.out.println("Following is a Topological " + 
	                           "sort of the given graph"); 
	        g.getTopologicalSort(); 
	}

	private void getTopologicalSort() {
		Stack stack = new Stack();
		boolean [] visited = new boolean[V];
		for(int i=0;i<V;i++) {
			visited[i] = false;
		}
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				topologicalSortingUtil(i,visited, stack);
			}
		}
		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");
		}
	}

	private void topologicalSortingUtil(int value, boolean[] visited, Stack stack) {
		visited[value] = true;
		Integer i;
		Iterator<Integer> list = adj[value].listIterator();
		while(list.hasNext()) {
			i = list.next();
			if(!visited[i]) {
				topologicalSortingUtil(i,visited,stack);
			}
		}
		stack.push(new Integer(value));
	}

}
