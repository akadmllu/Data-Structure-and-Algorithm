package com.problem.binarysearch;

/***
 * Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * 
 * Description	: 
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * 
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * Example 1:
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 * 
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 * 
 * Example 3:
 * Input: nums = [11,13,15,17]
 * Output: 11
 * Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
 */

public class LeetCode_153_FindMinimumRotatedSortedArray 
{
	public static int findMin(int[] arr) 
	{
        int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		
		while(start < end)
		{
			mid = start + (end - start) / 2;
			
			if(arr[mid] > arr[end])
				start = mid + 1;
			else if(arr[mid] < arr[end])
				end = mid;
			else 
				end--;
		}
		
		return arr[start];
    }
	
	public static void main(String[] args) 
	{
		int[] arr = { 45, 1, 1, 2, 2, 8, 10, 21, 31, 43, 45};
		System.out.println("Rotation Count : " + findMin(arr));
	}

}
