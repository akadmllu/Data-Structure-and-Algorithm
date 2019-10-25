import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		System.out.println("Bubble Sort");
		Random rand = new Random();
		int[] a = new int [200000];
        for (int i = 0; i < a.length; i++) {
            a [i] = rand.nextInt(200000);
        }
        
		long start = System.nanoTime();
		a = bubbleSort(a);
		long end = System.nanoTime();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(i % 20 == 0)
				System.out.println();
			System.out.print(a[i] + " ");
		}
		
		double timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
		System.out.println("\nTime spend in seconds	: " + timeInMillis/1000);
	}
	
	public static int[] bubbleSort(int[] a) {
		int temp;
		for(int i = a.length -1 ; i >=0 ; i--) {
			for(int j = 1 ; j <= i ; j++) {
				if(a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;	
				}
			}
		}
		return a;
	}

}
