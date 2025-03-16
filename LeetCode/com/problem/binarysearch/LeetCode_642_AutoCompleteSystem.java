package com.problem.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode_642_AutoCompleteSystem 
{
	class TrieNode
	{
		private Map<Character, TrieNode> children;
		private Map<String, Integer> sentenceFrequency;
		
		public TrieNode()
		{
			children = new HashMap<>();
			sentenceFrequency = new HashMap<>();
		}

		public Map<Character, TrieNode> getChildren() 
		{
			return children;
		}

		public Map<String, Integer> getSentenceFrequency() 
		{
			return sentenceFrequency;
		}
		
		public TrieNode addChild(char c)
		{
			children.putIfAbsent(c, new TrieNode());
			return children.get(c);
		}
		
		public void addSentence(String sentence, int frequency)
		{
			sentenceFrequency.put(sentence, sentenceFrequency.getOrDefault(sentence, 0) + frequency);
		}
		
		public TrieNode getChild(char c)
		{
			return children.get(c);
		}
		
		public boolean hasChild(char c)
		{
			return children.containsKey(c);
		}
	}
	
	private TrieNode root;
	private StringBuilder currentQuery;
	public LeetCode_642_AutoCompleteSystem(String[] sentences, int[] times)
	{
		this.root = new TrieNode();
		currentQuery = new StringBuilder();
		for(int i = 0 ; i < times.length; i++)
		{
			insert(sentences[i], times[i]);
		}
	}
	
	private void insert(String sentence, int frequency) 
	{
		TrieNode node = root;
		for(char c : sentence.toCharArray())
		{
			node = node.addChild(c);
			node.addSentence(sentence, frequency);
		}
	}
	
	private Map<String, Integer> search(String prefix)
	{
		TrieNode node = root;
		for(char c : prefix.toCharArray())
		{
			if(!node.hasChild(c))
			{
				return new HashMap<>();
			}
			node = node.getChild(c);
		}
		return node.getSentenceFrequency();
	}

	public List<String> input(char c)
	{
		if(c == '#')
		{
			insert(currentQuery.toString(), 1);
			currentQuery = new StringBuilder();
			return new ArrayList<>();
		}
		
		currentQuery.append(c);
		
		Map<String, Integer> resultMap = search(currentQuery.toString());
		
		PriorityQueue<String> minHeap = new PriorityQueue<>
		(
			(a,b) -> resultMap.get(a).equals(resultMap.get(b)) ? a.compareTo(b) : resultMap.get(b) - resultMap.get(a)
		);
		minHeap.addAll(resultMap.keySet());
		ArrayList<String> result = new ArrayList<>();
		int k = 3;
		while(k > 0 && !minHeap.isEmpty())
		{
			result.add(minHeap.poll());
			k--;
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		String[] sentences = {"i love you", "island","ironman", "i love geeksforgeeks", "ice-cream"};
		int[] times = {5,3,2,2,6};
		LeetCode_642_AutoCompleteSystem obj = new LeetCode_642_AutoCompleteSystem(sentences, times);
		List suggestion = obj.input('i');
		System.out.println(suggestion);
		suggestion = obj.input('a');
		System.out.println(suggestion);
		suggestion = obj.input('#');
		System.out.println(suggestion);
		suggestion = obj.input('i');
		System.out.println(suggestion);
		suggestion = obj.input('a');
		System.out.println(suggestion);
	}
}
