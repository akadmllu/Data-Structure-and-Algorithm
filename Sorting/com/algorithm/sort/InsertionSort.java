package com.algorithm.sort;

/**
 * Time Complexity : O( n ^ 2 )
 * 
 * Description: Builds the sorted array one element at a time by repeatedly picking the next element and 
 * inserting it into its correct position.
 */
public class InsertionSort 
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
	
	private static void insertionSort(int[] arr)
	{
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		insertionSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}
}
