package com.algorithm.search.binary;

public class CeilOfTarget 
{
	// return the index of smallest no >= target
	private static int ceiling(int[] arr, int target) 
	{
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		if(target > arr[end])
		{
			return -1;
		}
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
		return start;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,8,10,12,14,17,25,29};
		int item = 3;
		int index = ceiling(arr,item);
		if(index != -1)
			System.out.println("Target : " + item + " Ceil : " + arr[index] + " at index : " + index);
		else
			System.out.println("Ceiling not found");
	}

}
