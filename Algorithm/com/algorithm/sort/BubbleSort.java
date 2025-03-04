package com.algorithm.sort;

/**
 * Time Complexity : O( n ^ 2 )
 * 
 * Description: Compares adjacent elements and swaps them if they are in the wrong order. 
 * Repeats this process until the array is sorted.
 */
public class BubbleSort 
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
	
	private static void bubbleSort(int[] arr) 
	{
		int n = arr.length;
		boolean swapped;
		
		for(int i = 0 ; i < n - 1 ; i++)
		{
			swapped = false;
			for(int j = 0 ; j < n - 1 - i ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					swap(arr, j , j + 1);
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}

}
