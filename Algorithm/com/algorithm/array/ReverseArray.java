package com.algorithm.array;

import java.util.Arrays;

public class ReverseArray 
{
	private static void swap(int[] arr, int i, int j) 
	{
		if(i != j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
	}
	
	private static void reverseUsingRecurrsion(int[] arr,int start, int end)
	{
		if(start < end)
		{
			//System.out.println("Start : " + start + " , End : " + end);
			swap(arr, start, end);	
			reverseUsingRecurrsion(arr, start + 1, end - 1);
		}
	}
	
	private static void reverseUsingLoop(int[] arr,int start, int end)
	{
		while(start < end)
		{
			//System.out.println("Start : " + start + " , End : " + end);
			swap(arr, start++, end--);
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,6,8,10,12,14,17,25,29};
		reverseUsingLoop(arr, 0 , arr.length - 1 );
		System.out.println("Reversed Aray : " + Arrays.toString(arr));
		reverseUsingRecurrsion(arr, 0 , arr.length - 1);
		System.out.println("Reversed Aray : " + Arrays.toString(arr));
	}
}
