package com.problem.binarysearch;

/***
 * Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 * 
 * Description	: 
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 * Return the index of the peak element.
 * Your task is to solve it in O(log(n)) time complexity.
 * 
 * Example 1:
 * Input: arr = [0,1,0]
 * Output: 1
 * 
 * Example 2:
 * Input: arr = [0,2,1,0]
 * Output:  1
 * 
 * Example 3:
 * Input: arr = [0,10,5,2]
 * Output:  1
 */

public class LeetCode_852_PeakIndex {

	private static int peakIndexInMountainArray(int[] arr) 
	{
		int start = 1;
    	int mid = 0;
    	int end = arr.length - 2;
    	while(start <= end)
    	{
    		// Skip duplicates at the edges
            while (start < end && arr[start] == arr[end]) 
            {
                start++;
            }
            
    		mid = start + (end - start) / 2;
    		
    		if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
    			return mid;

    		else if(arr[mid - 1] < arr[mid])
    			start = mid + 1;
    		else
    			end = mid - 1;
    	}
    	return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {3,4,5,1};
		int index = peakIndexInMountainArray(arr);
		System.out.println(" Index : " + index);
	}

}
