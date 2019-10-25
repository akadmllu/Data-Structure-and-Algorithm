import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Fibonacci_Reccursion {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number : ");
		
		long n = Long.parseLong(br.readLine());
		
		long start = System.nanoTime();
		
		System.out.println(fib(n));		
		
		long end = System.nanoTime();
		
		double timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
		System.out.println("\nTime spend in seconds	: " + timeInMillis/1000);
	}

	private static int fib(long n) {
		if(n == 1 || n ==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}

}
