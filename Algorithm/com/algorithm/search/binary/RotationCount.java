package com.algorithm.search.binary;

public class RotationCount {

	private static int pivot(int[] arr)
    {
    	int start = 0;
    	int mid = 0;
    	int end = arr.length - 1;
    	while(start <= end)
    	{
    		// Skip duplicates at the edges
            while (start < end && arr[start] == arr[end]) 
            {
                start++;
            }
            
    		mid = start + (end - start) / 2;
    		
    		if(mid < end && arr[mid] > arr[mid + 1])
    			return mid;
    		if(mid > start && arr[mid] < arr[mid - 1])
    			return mid - 1;
    		
    		if(arr[mid] <= arr[start])
    			end = mid - 1;
    		else
    			start = mid + 1;
    	}
    	return -1;
    }
	
	 private static int countRotations(int[] arr) 
	 {
	        int pivot = pivot(arr);
	        return pivot + 1;
	    }
	
	public static void main(String[] args) {
		int[] arr = { 2,3,4,5,6,7,0,1, 2};
		System.out.println("Rotation Count : " + countRotations(arr));
	}

}
