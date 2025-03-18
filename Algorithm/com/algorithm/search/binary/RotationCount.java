package com.algorithm.search.binary;

public class RotationCount {

	public static int countRotations(int arr[])
	{		
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		
		while(start < end)
		{
			mid = start + (end - start) / 2;
			
			//Check if element (mid+1) is minimum 
			//{3, 4, 5, 1, 2} 
			//mid : 5 , mid + 1 : 1
			if(arr[mid] > arr[mid + 1])
				return mid + 1;
			
			//Check if mid itself is minimum element
			//{3, 4, 5, 1, 2} 
			//mid : 1 , mid - 1 : 5
			if(arr[mid] < arr[mid - 1])
				return mid;
			
			if(arr[end] > arr[mid])
			{
				end = mid - 1;
			}
			else 
			{
				start = mid + 1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7 };
		System.out.println("Rotation Count : " + countRotations(arr));
	}

}
