package com.algorithm.sort;

/**
 * Time Complexity
 * Average : O(n log n)
 * Worst : O( n ^ 2 )
 * 
 * Description: A divide-and-conquer algorithm that selects a pivot element and partitions the array around the pivot, 
 * recursively sorting the sub-arrays.
 */
public class QuickSort 
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
	
	private static int partition(int[] arr, int start, int end) 
	{
		int i = start - 1;
		int pivot = arr[end];
		
		for (int j = start; j < end ; j++) 
		{
			if(arr[j] < pivot)
			{
				i++;
				swap(arr, i , j);
			}
		}
		i++;
		swap(arr, i , end);		
		return i;
	}
	
	private static void quickSort(int[] arr, int start, int end) 
	{
		if(start < end)
		{
			int pivot = partition(arr, start, end);
			
			quickSort(arr, start, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}
	}
	private static void quickSort(int[] arr) 
	{
		quickSort(arr, 0 , arr.length - 1);
	}

	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		quickSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}
}
