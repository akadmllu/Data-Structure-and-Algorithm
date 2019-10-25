import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Fibonacci_Memoize {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number : ");
		
		long n = Long.parseLong(br.readLine());
		
		long start = System.nanoTime();
		
		System.out.println(fib(n,new long[(int)n +1]));		
		
		long end = System.nanoTime();
		
		double timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
		System.out.println("\nTime spend in seconds	: " + timeInMillis/1000);
	}

	private static long fib(long n,long mem[]) {
		if(mem[(int) n] != 0)
			return mem[(int) n];
		long result;
		if(n == 1 || n ==2)
			return 1;
		else
			result =  fib(n-1,mem)+fib(n-2,mem);
		mem[(int) n] = result;
		return result;
	}

}
