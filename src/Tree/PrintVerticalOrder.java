package Tree;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PrintVerticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        System.out.println("Vertical Order traversal is"); 
        printVerticalOrder(root); 

	}

	private static void printVerticalOrder(Node root) {
	   TreeMap<Integer, ArrayList<Integer>> tmap = new TreeMap<>();
	   int level = 0;
	   getVerticalOrder(root,level, tmap);
	   
	   
	   for (Entry<Integer, ArrayList<Integer>> entry : tmap.entrySet()) 
       { 
           System.out.print(entry.getValue()+" "); 
       } 
	   
	}

	private static void getVerticalOrder(Node root, int level, TreeMap<Integer, ArrayList<Integer>> tmap) {
		
		if(root ==  null) return;
		ArrayList<Integer> list = tmap.get(level);
		if(list == null) {
			list = new ArrayList<>();
			list.add(root.data);
		} else {
			list.add(root.data);
		}
		
		tmap.put(level, list);
		getVerticalOrder(root.left,level-1,tmap);
		getVerticalOrder(root.right, level+1, tmap);
	}

	
}
