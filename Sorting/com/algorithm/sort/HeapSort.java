package com.algorithm.sort;

/**
 * Time Complexity : O( n log n )
 * 
 * Description: Uses a binary heap data structure to sort elements by building a max-heap and 
 * then repeatedly extracting the maximum element.
 */
public class HeapSort 
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
	
	private static void heapify(int[] arr, int n , int i)
	{
		int largest;
		int left;
		int right;
		while(i < n)
		{
			largest = i ; 
			left = 2 * i + 1;
			right = 2 * i + 2;
			
			if(left < n && arr[left] > arr[largest])
			{
				largest = left;
			}
			if(right < n && arr[right] > arr[largest])
			{
				largest = right;
			}
			if(i != largest)
			{
				swap(arr, i , largest);
				i = largest;
			}
			else
			{
				break;
			}
		}
	}
	
	private static void heapSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = n/2 - 1 ; i >= 0 ; i-- )
		{
			heapify(arr, n , i);
		}
		
		for(int i = n - 1 ; i > 0 ; i--)
		{
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		heapSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}
}
