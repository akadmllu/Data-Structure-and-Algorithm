package com.algorithm.sort;

/**
 * Time Complexity : O( n + k ) where k is the range of the input
 * 
 * Description: Counts the occurrences of each element and uses this information to place elements in their correct positions.
 */
public class CountingSort 
{
	private static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void swap(int[] arr, int i, int j) 
	{
		if(i != j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}	
	}
	
	private static void countingSort(int[] arr)
	{
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		countingSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}
}
