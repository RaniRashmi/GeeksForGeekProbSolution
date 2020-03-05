package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BeadthFirstSearch {
    
	int V;
	LinkedList<Integer> adj[];
	public BeadthFirstSearch(int noOfVertex) {
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
		BeadthFirstSearch bfs = new BeadthFirstSearch(4);
		bfs.addEdge(0, 1); 
		bfs.addEdge(0, 2); 
		bfs.addEdge(1, 2); 
		bfs.addEdge(2, 0); 
		bfs.addEdge(2, 3); 
		bfs.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        bfs.getBreathFirstTraversal(2); 
	}

	private void getBreathFirstTraversal(int value) {
		boolean [] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[value] = true;
		queue.add(value);
		
		while(queue.size() != 0) {
			value = queue.poll();
			System.out.print(value+" ");
			
			Iterator<Integer> i = adj[value].listIterator();
			while(i.hasNext()) {
				int n= i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	//in case of list
	  static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
	    {
	       LinkedList<Integer> queue = new LinkedList<Integer>();
	       queue.add(s);
	       vis[s] = true;
	       
	       while(queue.size() !=0){
	           int val = queue.poll();
	           System.out.print(val+" ");
	           
	           Iterator<Integer> i = list.get(val).listIterator();
	           while(i.hasNext()){
	               int n = i.next();
	               if(!vis[n]){
	                   vis[n] = true;
	                   queue.add(n);
	               }
	           }
	       }
	    }

}
