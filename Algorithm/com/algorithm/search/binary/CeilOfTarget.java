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
		int[] arr = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 26, 26, 26, 28, 28, 28, 31, 31, 32, 33, 34, 34, 35, 36, 
				36, 37, 38, 38, 39, 41, 41, 42, 43, 43, 44, 44, 45, 45, 46, 47, 49, 49, 50, 50, 50, 51, 53, 54, 54, 
				56, 57, 58, 58, 59, 60, 64, 67, 69, 75, 94};
		int item = 24;
		int index = ceiling(arr,item);
		if(index != -1)
			System.out.println("Target : " + item + " Ceil : " + arr[index] + " at index : " + index);
		else
			System.out.println("Ceiling not found");
	}

}
