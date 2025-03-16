package com.algorithm.search.binary;

/**
 * Should be used on Sorted Array
 * Time Complexity : O(n log n)
 */
public class BinarySearch 
{
	private static int binarySearch(int[] arr, int target) 
	{
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		while(start <= end)
		{
			mid = start + (end - start) / 2;
			if(target < arr[mid])
				end = mid - 1;
			else if(target > arr[mid])
				start = mid + 1;
			else
				return mid;		
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,6,8,10,12,14,17,25,29};
		int item = 29;
		int index = binarySearch(arr,item);
		if(index != -1)
			System.out.println(" Value : " + item + " Index : " + index);
		else
			System.out.println("item not found");
	}

}
