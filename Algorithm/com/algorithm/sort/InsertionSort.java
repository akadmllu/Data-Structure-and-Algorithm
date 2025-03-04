package com.algorithm.sort;

/**
 * Time Complexity : O( n ^ 2 )
 * 
 * Description: Builds the sorted array one element at a time by repeatedly picking the next element and 
 * inserting it into its correct position.
 */
public class InsertionSort 
{
	private static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
	}
	
	// Function to perform optimized insertion sort
	private static void optimizedInsertionSort(int[] arr) 
	{
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Find the correct position of key using binary search
            int pos = binarySearch(arr, key, 0, j);

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= pos) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Function to perform binary search
	private static int binarySearch(int[] arr, int key, int low, int high) 
	{
        if (high <= low) {
            return (key > arr[low]) ? (low + 1) : low;
        }

        int mid = (low + high) / 2;

        if (key == arr[mid]) {
            return mid + 1;
        }

        if (key > arr[mid]) {
            return binarySearch(arr, key, mid + 1, high);
        }

        return binarySearch(arr, key, low, mid - 1);
    }
	
	public static void main(String[] args) 
	{
		int[] arr = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr);
		
		insertionSort(arr);
		
		System.out.print("sorted array after insertion sort : ");
		printArray(arr);
		
		int[] arr2 = {6,8,12,1,14,17,5,3,29,25,4,5};
		
		System.out.print("unsorted array : ");
		printArray(arr2);
		
		optimizedInsertionSort(arr2);
		
		System.out.print("sorted array after optimized insertion sort : ");
		printArray(arr2);
	}
}
