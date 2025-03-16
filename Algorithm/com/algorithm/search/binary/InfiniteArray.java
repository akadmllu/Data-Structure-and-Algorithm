package com.algorithm.search.binary;

public class InfiniteArray {

	private static int binarySearch(int[] arr, int target, int start, int end) 
	{
		int mid = 0;
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
	
	private static int find(int[] arr, int target, int start, int end)
	{		
		try
		{
			while (target > arr[end] 
					&& start <= end)
			{
				int newStart = end + 1;
				end = end + (end - start + 1) * 2;
				start = newStart;
			}
			return binarySearch(arr,target,start,end);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			return find(arr,target,start,end - 1);
		}		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,6,8,10,12,14,17,25,29,32};
		int item = 35;
		int index = find(arr,item, 0 ,1);
		if(index != -1)
			System.out.println(" Value : " + item + " Index : " + index);
		else
			System.out.println("item not found");
	}

}
