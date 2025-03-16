package com.algorithm.search.binary;

public class FloorOfTarget 
{
	//returns the index : greatest number <= target
	private static int floor(int[] arr, int item) 
	{
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		while(start <= end)
		{
			mid = start + (end - start) / 2;
			if(item > arr[mid])
				start = mid + 1;
			else if(item < arr[mid])
				end = mid - 1;
			else
				return mid;
		}
		return end;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,8,10,12,14,17,25,29};
		int item = 15;
		int index = floor(arr,item);
		if(index != -1)
			System.out.println("Target : " + item + " floor : " + arr[index] + " at index : " + index);
		else
			System.out.println("floor not found");
	}

}
