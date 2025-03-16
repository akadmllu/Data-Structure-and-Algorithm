package com.problem.binarysearch;

/***
 * Link : https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=binary-search
 * 
 * Description	: 
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 */

public class LeetCode_33_RotatedSortedArray 
{
	public static int search(int nums[], int target)
	{		
		int start = 0;
		int mid = 0;
		int end = nums.length - 1;
		
		while(start <= end)
		{
			mid = start + (end - start) / 2;
			
			// Check if we found the target
			if(target == nums[mid])
				return mid;
			
			// Skip duplicates
			if(nums[start] == nums[mid] && nums[end] == nums[mid])
			{
				start++;
				end++;
				continue;
			}
			
			// Check if the left half is sorted
			if(nums[start] <= nums[mid])
			{
				// Target is within the sorted left half
				if(isInRange(target,nums[start], nums[mid]))
					end = mid - 1;
				// Otherwise, search in the right half
				else
					start = mid + 1;
			}
			// Right half is sorted
			else
			{
				// Target is within the sorted right half
				if(isInRange(target,nums[mid], nums[end]))
					start = mid + 1;
				// Otherwise, search in the left half
				else
					end = mid - 1;
			}
		}
		
		return -1;
	}
	
	// Helper method to check if target lies in range [start, end]
    private static boolean isInRange(int target, int start, int end) 
    {
        return target >= start && target <= end;
    }
	
	public static void main(String[] args) 
	{
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int index = search(nums, target);
		System.out.println(" Index : " + index);

	}
}
