import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TestMergeSort {

    public static void merge(int[] arr, int jLeft, int jMid ,int jRight){
        int n1 = jMid - jLeft + 1;
        int n2 = jRight - jMid;

        int[] arrLeft = new int[n1];
        int[] arrRight = new int[n2];

        for(int i = 0 ; i < n1 ; i++){
            arrLeft[i] = arr[jLeft + i];
        }
        for(int j = 0 ; j < n2 ; j++){
            arrRight[j] = arr[jMid + j + 1];
        }
        int i=0,j=0,k=jLeft;
        while(i < n1 && j < n2){
            if(arrLeft[i] < arrRight[j]){
                arr[k++] = arrLeft[i++];
            }
            else{
                arr[k++] = arrRight[j++];
            }
        }
        while(i < n1){
            arr[k++] = arrLeft[i++];
        }
        while(j < n2){
            arr[k++] = arrRight[j++];
        }
    }

    public static void mergeSort(int[] arr, int jLeft, int jRight){
        if(jLeft < jRight){
            int jMid = jLeft + (jRight-jLeft)/2;
            mergeSort(arr,jLeft,jMid);
            mergeSort(arr,jMid+1,jRight);
            merge(arr,jLeft,jMid,jRight);
        }
    }

    public static int[] performMergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(performMergeSort(arr)));
    }
}
