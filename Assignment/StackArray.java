import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class StackArray {

	protected int arr[];
	
	protected int size,top,len;
	
	StackArray(int size){
		this.size = size;
		len = 0;
		top = -1;
		arr = new int[this.size];
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == size - 1)
			return true;
		else
			return false;
	}
	
	public int getSize() {
		return len;
	}
	
	public int peek() {
		if(!isEmpty())
			return arr[top];
		else
			throw new NoSuchElementException("stack is empty");
	}
	
	public void push(int element) {
		if(!isFull()){
			arr[++top] = element;
			len++;
		}
		else
			throw new IndexOutOfBoundsException("stack is full");
	}
	
	public int pop() {
		if(!isEmpty()) {
			len--;
			return arr[top--];
		}
		else
			throw new NoSuchElementException("stack is empty");
	}
	
	public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
	
}

class StackArrayImplementer{
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader objBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the size of stack : ");
		int jSize = Integer.parseInt(objBufferedReader.readLine());
		
		StackArray objStackArray = new StackArray(jSize);
		
		int jchoice = 0;
		String strChoice = "\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\n"
				+ "Enter your choice : ";
		
		do 
		{						
			System.out.print(strChoice);
			jchoice = Integer.parseInt(objBufferedReader.readLine());
			
			switch(jchoice) {
				case 1: 
						System.out.print("Enter the number : ");
						int jNumber = Integer.parseInt(objBufferedReader.readLine());
						try {
							objStackArray.push(jNumber);
						}
						catch(Exception e) {
							System.out.println("Error : " + e.getMessage());
						}
						break;
				case 2 :
						try {
							System.out.println("Popped Element : " + objStackArray.pop());
						}
						catch(Exception e) {
							System.out.println("Error : " + e.getMessage());
						}
						break;
				case 3 :
						try {
							System.out.println("Peek Element : " + objStackArray.peek());
						}
						catch(Exception e) {
							System.out.println("Error : " + e.getMessage());
						}
						break;						
				case 4 :
						objStackArray.display();
						break;
				default : System.out.println("Invalid choice");;
			}
		}
		while(jchoice != 5); 
		
	}
	
}
