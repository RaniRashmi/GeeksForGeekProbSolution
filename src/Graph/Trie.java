package Graph;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	private class TrieNode{
		Map<Character,TrieNode> children;
		boolean endOfWord;
		
		public TrieNode() {
			children = new HashMap<>();
			endOfWord = false;
		}
	}
	
	TrieNode root;
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
	    TrieNode current = root;
	    for(int i=0;i<word.length();i++) {
	    	char ch = word.charAt(i);
	    	TrieNode node = current.children.get(ch);
	    	if(node == null) {
	    		node = new TrieNode();
	    		current.children.put(ch, node);
	    	}
	    	current = node;
	    }
	    current.endOfWord = true;
	}
	
	public void recursiveInsert(String word) {
		recursiveInsert(root, word, 0);
	}

	private void recursiveInsert(TrieNode current, String word, int index) {
		if(index == word.length()) {
			current.endOfWord = true;
			return;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		
		if(node == null) {
			node = new TrieNode();
    		current.children.put(ch, node);
		}
		
		recursiveInsert(node, word, index+1);
	}
	
	public boolean search(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			
			if(node == null) {
			  return false;
			}
			current = node;
		}
		return current.endOfWord;
	}
	
	public boolean recursiveSearch(String word) {
		return recursiveSearch(root, word,0);
	}

	private boolean recursiveSearch(TrieNode current, String word, int index) {
		if(index == word.length()) {
			return current.endOfWord;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		
		if(node == null) {
			return false;
		}
		
		return recursiveSearch(node, word, index+1);
	}
	
	 public boolean deleteRecursive(String word) {
		 return deleteRecursive(root, word, 0);
	    }

	private boolean deleteRecursive(TrieNode current, String word, int index) {
		if(index == word.length()) {
			if(!current.endOfWord) {
				return false;
			}
			current.endOfWord = false;
			return current.children.size() ==0;
		}
		
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		
		if(node == null) {
			return false;
		}
		
		boolean shouldDeleteCurrentNode = deleteRecursive(node, word, index+1);
		if(shouldDeleteCurrentNode) {
			current.children.remove(ch);
			return current.children.size() ==0;
		}
		return false;
	}

}
