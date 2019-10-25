import java.util.Random;
import java.util.concurrent.TimeUnit;

public class QuickSort {

public static void main(String[] args) {
		
		
		System.out.println("Selection Sort");
		Random rand = new Random();
		int[] a = new int [200000];
        for (int i = 0; i < a.length; i++) {
            a [i] = rand.nextInt(200000);
        }
        
		long start = System.nanoTime();
		a = selectionSort(a);
		long end = System.nanoTime();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(i % 20 == 0)
				System.out.println();
			System.out.print(a[i] + " ");
		}
		
		double timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
		System.out.println("\nTime spend in seconds	: " + timeInMillis/1000);
	}
	
	public static int[] selectionSort(int[] a) {
		int i, j; 
	    int min, temp;  
	    for (i = 0; i < a.length-1; i++) { 
	        min = i; 
	       for (j = i+1; j < a.length; j++) 
	          if (a[j] < a[min]) 
	             min = j; 
	       temp = a[i]; 
	       a[i] = a[min]; 
	       a[min] = temp; 
	    } 
		return a;
	}

}
