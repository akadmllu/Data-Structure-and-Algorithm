package com.problem.binarysearch;

/***
 * Link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
 * 
 * Description	: 
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 * 
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 * 
 * You must decrease the overall operation steps as much as possible.
 * 
 * Example 1:
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * 
 * Example 2:
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 */
public class LeetCode_81_SearchRotatedSortedArray 
{
	public static boolean search(int[] nums, int target) {
        int start = 0;
		int mid = 0;
		int end = nums.length - 1;
		
		while(start <= end)
		{
			mid = start + (end - start) / 2;
			
			// Check if we found the target
			if(target == nums[mid])
				return true;
			
			// Handle duplicates: skip the duplicates from both ends
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
            
			// Check if the left half is sorted
			if(nums[start] <= nums[mid])
			{
				// Target is within the sorted left half
				if(nums[start] <= target && target < nums[mid])
					end = mid - 1;
				// Otherwise, search in the right half
				else
					start = mid + 1;
			}
			// Right half is sorted
			else
			{
				// Target is within the sorted right half
				if(nums[mid] < target && target <= nums[end])
					start = mid + 1;
				// Otherwise, search in the left half
				else
					end = mid - 1;
			}
		}
		
		return false;
    }
	
	public static void main(String[] args) 
	{
		int[] nums = { 1,0,1,1,1 };
		int target = 0;

		boolean ispresent = search(nums, target);
		System.out.println(" Is Present : " + ispresent);
	}

}
