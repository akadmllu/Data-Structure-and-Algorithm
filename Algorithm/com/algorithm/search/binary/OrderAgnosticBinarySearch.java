package com.algorithm.search.binary;

public class OrderAgnosticBinarySearch {

	private static int orderAgnosticBinarySearch(int[] arr, int target) 
	{
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		boolean isAscending = arr[start] < arr[end];
		while(start <= end)
		{
			mid = start + (end - start) / 2;
			if(target == arr[mid])
				return mid;
			if(isAscending)
			{
				if(target > arr[mid])
					start = mid + 1;
				else
					end = mid - 1;
			}
			else
			{
				if(target < arr[mid])
					start = mid + 1;
				else
					end = mid - 1;
			}
							
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		//int[] arr = {1,3,4,6,8,10,12,14,17,25,29};
		int[] arr = {29,25,17,14,12,10,8,6,4,3,1};
		int item = 29;
		int index = orderAgnosticBinarySearch(arr,item);
		System.out.println(" Value : " + item + " Index : " + index);
	}

}
