package com.algorithm.sort;

/**
 * Time Complexity : O(n log n)
 * 
 * Description: A stable, divide-and-conquer algorithm that divides the array into halves, 
 * sorts them, and then merges them back together.
 */
public class MergeSort 
{
	private static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void merge(int[] arr, int left, int mid, int right) 
	{
		int leftSize = mid - left + 1;
        int rightSize = right - mid;
        
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        
        for (int i = 0; i < leftSize; ++i)
        {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < rightSize; ++i)
        {
            rightArray[i] = arr[mid + 1 + i];
        }
        
        int i = 0, j = 0, k = left;
        
        while (i < leftSize && j < rightSize)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arr[k++] = leftArray[i++];
            }
            else
            {
                arr[k++] = rightArray[j++];
            }
        }
        
        while (i < leftSize)
        {
            arr[k++] = leftArray[i++];
        }
        
        while (j < rightSize)
        {
            arr[k++] = rightArray[j++];
        }
	}
	
	private static void mergeSort(int[] arr, int left, int right) 
	{
		if(left < right)
		{
			int mid = left + (right - left) / 2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid + 1, right);
			merge(arr,left,mid,right);
		}
	}
	
	private static void mergeSort(int[] arr) 
	{
		mergeSort(arr, 0, arr.length - 1);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		mergeSort(arr);
		
		System.out.print("sorted array : ");
		printArray(arr);
	}	
}
