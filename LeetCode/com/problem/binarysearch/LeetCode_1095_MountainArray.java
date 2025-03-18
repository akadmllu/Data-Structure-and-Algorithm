package com.problem.binarysearch;

/***
 * Link : https://leetcode.com/problems/find-in-mountain-array/description/
 * 
 * Description	: 	
 * You may recall that an array arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
 * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
 * 
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array.
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt 
 * to circumvent the judge will result in disqualification.
 *  
 * Example 1:
 * Input: mountainArr = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 * 
 * Example 2:
 * Input: mountainArr = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 */

public class LeetCode_1095_MountainArray {

	private static int orderAgnosticBinarySearch(MountainArray mountainArr, int target, int start, int end) 
	{
		int mid = 0;
		boolean isAscending = mountainArr.get(start) < mountainArr.get(end);
		while(start <= end)
		{
			mid = start + (end - start) / 2;
			if(target == mountainArr.get(mid))
				return mid;
			if(isAscending)
			{
				if(target > mountainArr.get(mid))
					start = mid + 1;
				else
					end = mid - 1;
			}
			else
			{
				if(target < mountainArr.get(mid))
					start = mid + 1;
				else
					end = mid - 1;
			}
							
		}
		return -1;
	}
	private static int peakIndexInMountainArray(MountainArray mountainArr) 
	{
		int start = 0;
		int mid = 0;
		int end = mountainArr.length() - 1;
		while(start < end)
    	{
    		mid = start + (end - start) / 2;
    		
    		if(isPeak(mountainArr, mid))
    			return mid;
    		
    		//increasing part of mountain
    		if( mountainArr.get(mid) <  mountainArr.get(mid + 1))
    			start = mid + 1;
    		//decreasing part of mountain
    		else if( mountainArr.get(mid) >  mountainArr.get(mid + 1))
    			end = mid;
    		else
    		{
    			//handle duplicates by skipping one element at a time
    			if(mountainArr.get(start) ==  mountainArr.get(mid)) start++;
    			if(mountainArr.get(end) ==  mountainArr.get(mid)) end--;
    		}
    	}
    	return start;
	}
	
	private static boolean isPeak(MountainArray mountainArr, int mid) 
	{
		// 4 < 5 > 3
		return mountainArr.get(mid - 1) < mountainArr.get(mid) && mountainArr.get(mid) > mountainArr.get(mid + 1) ;
	}
	
	public static int findInMountainArray(int target, MountainArray mountainArr) {
		int peak = peakIndexInMountainArray(mountainArr);
		int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
		if(firstTry != -1)
			return firstTry;
		
        return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,3,4,5,3,1,1};
		MountainArrayImpl mountainArr = new MountainArrayImpl(arr);
		int target = 5;

		int index = findInMountainArray(target,mountainArr);
		System.out.println(" Index : " + index);
	}
}

class MountainArrayImpl implements MountainArray
{
	int[] mountainArr;
	MountainArrayImpl(int[] mountainArr)
	{
		this.mountainArr = mountainArr;
	}
	
	@Override
	public int get(int index) {
		return mountainArr[index];
	}

	@Override
	public int length() {
		return mountainArr.length;
	}
	
}

interface MountainArray {
    public int get(int index) ;
    public int length();
 }
