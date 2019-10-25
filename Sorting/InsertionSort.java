import java.util.Random;
import java.util.concurrent.TimeUnit;

public class InsertionSort {

	public static void main(String[] args) {
		
		System.out.println("Insertion Sort");
		Random rand = new Random();
		int[] a = new int [200000];
        for (int i = 0; i < a.length; i++) {
            a [i] = rand.nextInt(200000);
        }
		
		long start = System.nanoTime();
		a = insertionSort(a);
		long end = System.nanoTime();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(i % 20 == 0)
				System.out.println();
			System.out.print(a[i] + " ");
		}
		
		double timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		System.out.println("\nTime spend in second : " + timeInMillis/1000);
		
	}
	
	public static int[] insertionSort(int[] a) {
		for(int i = 0 ; i < a.length ; i++) {
			int x = a[i];
			int j = i;
			while(j > 0 && a[j-1] > x) {
				a[j] = a[j-1];
				j = j - 1;
			}
			a[j] = x;
		}
		return a;
	}
}
