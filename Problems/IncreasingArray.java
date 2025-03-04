import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingArray {

	public static int [] a = new int[0];
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader objBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int jchoice = 0;
		String strChoice = "\n1.Add\n2.Delete\n3.Print\n4.Exit\n"
				+ "Enter your choice : ";
		
		do 
		{
			System.out.print(strChoice);
			jchoice = Integer.parseInt(objBufferedReader.readLine());
			
			switch(jchoice) {
				case 1: 
						System.out.print("Enter the number : ");
						int jNumber = Integer.parseInt(objBufferedReader.readLine());
						add(jNumber);
						print();
						break;
				case 2 :
						delete();
						print();
						break;
				case 3 :
						print();
					break;
				default : System.out.println("Invalid choice");;
			}
		}
		while(jchoice != 4); 
	}
	
	public static void print() {
		if(a.length > 0) {
			System.out.print("[ ");
			for(int i = 0 ; i < a.length ; i++)
				System.out.print(a[i] + " ");
			System.out.println("]");
		}
		else
			System.out.println("Array is empty");
	}

	public static void add(int jNumber) {
		int[] copy = new int[a.length + 1];
		System.arraycopy(a, 0, copy, 0, a.length);
		copy[a.length] = jNumber;
		a = copy;
	}
	
	public static void delete() {
		if(a.length > 0) {
			int[] copy = new int[a.length - 1];
			System.arraycopy(a, 0, copy, 0, a.length - 1);
			a = copy;
		}
	}
	
}
