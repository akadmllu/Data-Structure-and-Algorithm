package com.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Node implements Comparable<Node>
{
	private int vertex;
	private int cost;
	
	public Node(int vertex, int cost) 
	{
		this.vertex = vertex;
		this.cost = cost;
	}
	
	public int getVertex() {
		return vertex;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public int compareTo(Node o) 
	{
		return Integer.compare(this.cost, o.cost);
	}
}

public class DijkstraAlgorithm 
{
	private int vertices;
	private List<List<Node>> adjacentList;
	
	public DijkstraAlgorithm(int vertices)
	{
		this.vertices = vertices;
		adjacentList = new ArrayList<>(vertices);
		for (int i = 0; i < vertices; i++) {
			adjacentList.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int src, int dest, int weight)
	{
		adjacentList.get(src).add(new Node(dest, weight));
		adjacentList.get(dest).add(new Node(src, weight)); // If the graph is undirected
	}
	
	public void dijkstra(int startVertex)
	{
		PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
		int[] distance = new int[vertices];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[startVertex] = 0;
		
		priorityQueue.add(new Node(startVertex, 0));
		
		while(!priorityQueue.isEmpty())
		{
			Node node = priorityQueue.poll();
			int vertex = node.getVertex();
			
			for(Node neighbor : adjacentList.get(vertex))
			{
				int newDistance = distance[vertex] + neighbor.getCost();
				
				if(newDistance < distance[neighbor.getVertex()])
				{
					distance[neighbor.getVertex()] = newDistance;
					priorityQueue.add(new Node(neighbor.getVertex(), newDistance));
				}
			}
		}
		
		printDistance(distance);
	}
	
	public static void printDistance(int[] arr)
	{
		System.out.println("Shortest paths from the start vertex:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Vertex " + i + ": " + arr[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		int vertices = 6;
        
		DijkstraAlgorithm graph = new DijkstraAlgorithm(vertices);
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 4, 1);
        graph.addEdge(4, 5, 2);

        int startVertex = 0;
        graph.dijkstra(startVertex);
	}
}
