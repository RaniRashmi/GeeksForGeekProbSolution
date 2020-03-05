package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DepthFirstSearch {

	int V;
	LinkedList<Integer> adj [];
	public DepthFirstSearch(int noOfVertex) {
		V = noOfVertex;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i] = new LinkedList<Integer>();
		}	
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
	public static void main(String[] args) {
		DepthFirstSearch dfs = new DepthFirstSearch(4);
		dfs.addEdge(0, 1); 
		dfs.addEdge(0, 2); 
		dfs.addEdge(1, 2); 
		dfs.addEdge(2, 0); 
		dfs.addEdge(2, 3); 
		dfs.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
        dfs.findDepthFirstSearch(2);
	}

	private void findDepthFirstSearch(int value) {
		boolean [] visited = new boolean[V];
		findDepthFirstSearch(visited, value);
	}

	private void findDepthFirstSearch(boolean[] visited, int value) {
		visited[value] = true;
		System.out.print(value+" ");
		
		Iterator<Integer> i = adj[value].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				findDepthFirstSearch(visited,n);
			}
		}
	}
	
	// list is input as arraylist
		static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
	    {
			vis[src] = true;
			System.out.print(src+" ");
			
			Iterator<Integer> i = list.get(src).listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!vis[n]){
					dfs(n, list,vis);
				}
			}
			
			
	    }

}
