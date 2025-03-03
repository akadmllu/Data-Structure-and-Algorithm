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
	
	private static int getLeft(int index)
	{
		return 2 * index + 1;
	}
	
	private static int getRight(int index)
	{
		return 2 * index + 2;
	}
	
	private static void heapify(int[] arr, int arrSize , int index)
	{
		int largest;
		int left;
		int right;
		while(index < arrSize)
		{
			largest = index ; 
			left = getLeft(index);
			right = getRight(index);
			
			if(left < arrSize && arr[left] > arr[largest])
			{
				largest = left;
			}
			if(right < arrSize && arr[right] > arr[largest])
			{
				largest = right;
			}
			if(index != largest)
			{
				swap(arr, index , largest);
				index = largest;
			}
			else
			{
				break;
			}
		}
	}
	
	private static void heapSort(int[] arr)
	{
		int arrSize = arr.length;
		
		for(int i = arrSize/2 - 1 ; i >= 0 ; i-- )
		{
			heapify(arr, arrSize , i);
		}
		
		for(int i = arrSize - 1 ; i > 0 ; i--)
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
