import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Fibonacci_BottomUp {

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

	private static long fib(long n) {
		if(n == 1 || n ==2)
			return 1;
		long[] mem = new long[(int) (n)];
		mem[0] = 1;
		mem[1] = 1;
		for(int i = 2 ; i < n ; i++) {
			mem[i] =  mem[(int) (i-1)]+mem[(int) (i-2)];			
		}		
		return mem[(int) n-1];
	}

}
