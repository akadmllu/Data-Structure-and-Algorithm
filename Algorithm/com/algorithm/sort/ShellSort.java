package com.algorithm.sort;

/**
 * Time Complexity : O( n ^ 1.5 )
 * 
 * Description: An optimized version of Insertion Sort, it allows the exchange of far-apart elements and 
 * reduces the gap between elements until the array is sorted.
 */
public class ShellSort 
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
	
	private static void shellSort(int[] arr)
	{
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		shellSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}
}
