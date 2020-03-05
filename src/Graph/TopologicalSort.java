package Graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TopologicalSort {

	int V;
	LinkedList<Integer> adj [];
	
	public TopologicalSort(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void topologicalSort() {
		Stack stack = new Stack();
		boolean [] visited = new boolean[V];
		for(int i=0;i<V;i++) {
			visited[i] = false;
		}
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				topologicalSortUtil(i,visited, stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	private void topologicalSortUtil(int v, boolean[] visited, Stack stack) {
		visited[v] = true;

		ListIterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				topologicalSortUtil(n, visited, stack);
			}
		}
		stack.push(new Integer(v));
	}

	public static void main(String[] args) {
		TopologicalSort g = new TopologicalSort(6); 
	        g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
	  
	        System.out.println("Following is a Topological " + 
	                           "sort of the given graph"); 
	        g.topologicalSort(); 
	}

}
