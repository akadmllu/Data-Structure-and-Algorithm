package com.problem.binarysearch;

/***
 * Link : https://leetcode.com/problems/search-insert-position/description/
 * 
 * Description	: 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *  
 * You must decrease the overall operation steps as much as possible.
 * 
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */

public class LeetCode_35_SearchInsertPosition {
	
	private static int searchInsert(int[] arr, int target) 
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
		return start;
	}

	public static void main(String[] args) 
	{
		int[] arr = { 1,3,5,6};
		int target = 7 ;
		System.out.println("Insert Position : " + searchInsert(arr,target));
	}
}
