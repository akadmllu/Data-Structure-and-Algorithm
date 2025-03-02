package com.algorithm.sort;

/**
 * Time Complexity : O( n ^ 2 )
 * 
 * Description: Repeatedly finds the minimum element and moves it to the beginning of the array.
 */
public class SelectionSort 
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
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	
	private static void selectionSort(int[] arr) 
	{
		int n = arr.length;
		
		for (int i = 0; i < n -1 ; i++) 
		{
			int minIndex = i;
			for (int j = i + 1 ; j < n ; j++) 
			{
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			
			if(minIndex != i)
			{
				swap(arr, i, minIndex);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		selectionSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}
}
