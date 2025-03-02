package com.algorithm.search;

/**
 * Should be used on Sorted Array
 * Time Complexity : O(n log n)
 */
public class BinarySearch 
{
	private static int binarySearch(int[] arr, int item) 
	{
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while(low <= high)
		{
			mid = low + (high - low) / 2;
			if(item == arr[mid])
				return mid;
			if(item > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;				
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,6,8,10,12,14,17,25,29};
		int item = 29;
		int index = binarySearch(arr,item);
		System.out.println(" Value : " + item + " Index : " + index);
	}

}
