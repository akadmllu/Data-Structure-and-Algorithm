package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch 
{
	private int noOfVertices;
	private List<List<Integer>> adjacentList;
	
	public BreadthFirstSearch(int ofOfVertices)
	{
		this.noOfVertices = ofOfVertices;
		adjacentList = new ArrayList<>(noOfVertices);
		for(int i = 0 ; i < noOfVertices ; i++)
		{
			adjacentList.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int src, int dest)
	{
		adjacentList.get(src).add(dest);
		adjacentList.get(dest).add(src); //For an Undirected Graph
	}
	
	public int[] bfsShortestDistance(int startVertex)
	{
		boolean[] visited = new boolean[noOfVertices];
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] distance = new int[noOfVertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
		
		visited[startVertex] = true;
		distance[startVertex] = 0;
		queue.add(startVertex);
		
		while(!queue.isEmpty())
		{
			int vertex = queue.poll();
			
			for(int adjVertex : adjacentList.get(vertex))
			{
				if(!visited[adjVertex])
				{
					visited[adjVertex] = true;
					distance[adjVertex] = distance[vertex] + 1;
					queue.add(adjVertex);
				}
			}
		}
		return distance;
	}
	
	public void bfsTraversal(int startVertex)
	{
		boolean[] visited = new boolean[noOfVertices];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		visited[startVertex] = true;
		queue.add(startVertex);
		
		while(!queue.isEmpty())
		{
			int vertex = queue.poll();
			System.out.print(vertex + " ");
			
			for(int adjVertex : adjacentList.get(vertex))
			{
				if(!visited[adjVertex])
				{
					visited[adjVertex] = true;
					queue.add(adjVertex);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		BreadthFirstSearch bfs = new BreadthFirstSearch(6);
		
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 3);
		bfs.addEdge(1, 4);
		bfs.addEdge(2, 4);
        bfs.addEdge(3, 5);
        bfs.addEdge(4, 5);
        
        int startVertex = 0;
        
        System.out.print("Breadth-First Search starting from node " + startVertex + " : ");
        bfs.bfsTraversal(startVertex);
        
        int[] distances = bfs.bfsShortestDistance(startVertex);
        System.out.println("\n\nShortest distances from vertex " + startVertex + " : " + Arrays.toString(distances));
	}

}
