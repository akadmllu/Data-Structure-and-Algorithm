package com.algorithm.search.binary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
			//{3, 4, 5, 1, 2} e.g: mid=5 , mid+1=1
			if(mid < end && arr[mid] > arr[mid + 1])
				return mid + 1;
			
			//Check if mid itself is minimum element
			//{3, 4, 5, 1, 2}  e.g: mid=1 , mid-1=5
			if(mid > start && arr[mid] < arr[mid - 1])
				return mid;
			
			if(arr[end] > arr[mid])
				end = mid - 1;
			else 
				start = mid + 1;
		}
		
		return 0;
	}
	
	public static int findKRotation(List<Integer> arr) {
		
		int start = 0;
		int mid = 0;
		int end = arr.size() - 1;

		while (start < end) {
			mid = start + (end - start) / 2;

			// Check if element (mid+1) is minimum
			// {3, 4, 5, 1, 2} e.g: mid=5 , mid+1=1
			if (mid < end && arr.get(mid) > arr.get(mid + 1))
				return mid + 1;

			// Check if mid itself is minimum element
			// {3, 4, 5, 1, 2} e.g: mid=1 , mid-1=5
			if (mid > start && arr.get(mid) < arr.get(mid - 1))
				return mid;

			if (arr.get(end) > arr.get(mid))
				end = mid - 1;
			else
				start = mid + 1;
		}

		return 0;
	}
	

	public static void main(String[] args) 
	{
		int[] arr = { 45, 2, 8, 10, 21, 31, 43, 45};
		System.out.println("Rotation Count : " + countRotations(arr));
		System.out.println("Rotation Count : " + findKRotation(Arrays.stream(arr).boxed().collect(Collectors.toList())));
	}

}
